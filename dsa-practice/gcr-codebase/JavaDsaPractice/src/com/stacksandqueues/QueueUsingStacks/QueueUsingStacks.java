package com.stacksandqueues.QueueUsingStacks;

import java.util.Stack;
public class QueueUsingStacks {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    //enqueue operation
    public void enqueue(int data) {
        stack1.push(data);
        System.out.println(data + " enqueued into queue");
    }
    //dequeue operation
    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    //peek operation
    public int peek() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    //Display
    public void display() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.print("Queue Elements: ");

        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }

        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }

        System.out.println();
    }
}
