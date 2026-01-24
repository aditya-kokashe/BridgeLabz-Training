package com.collections.queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueMain {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);

        QueueReverser.reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}
