package com.stacksandqueues.QueueUsingStacks;

public class Main {
    public static void main(String[] args) {

        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        q.enqueue(40);
        q.display();

        System.out.println("Front Element: " + q.peek());
    }
}
