package com.collections.queueinterface.stackusingqueues;

public class StackUsingQueuesMain {

    public static void main(String[] args) {

        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("New Top: " + stack.top());
    }
}
