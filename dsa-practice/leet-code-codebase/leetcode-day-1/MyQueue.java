//Leetcode problem 232

import java.util.Stack;
public class MyQueue {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    //Push element to back of queue
    public void push(int x) {
        input.push(x);
    }

    //Remove element from front of queue
    public int pop() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    //Get front element
    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    //Check if queue is empty
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    //Main 
    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.peek());   
        System.out.println(q.pop());    
        System.out.println(q.pop());    
        System.out.println(q.empty());  
        System.out.println(q.pop());    
        System.out.println(q.empty());  
    }
}
