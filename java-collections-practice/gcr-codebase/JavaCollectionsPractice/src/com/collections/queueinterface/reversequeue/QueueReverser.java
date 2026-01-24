package com.collections.queueinterface.reversequeue;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {

    public static <T> void reverseQueue(Queue<T> queue) {

        Stack<T> stack = new Stack<>();

        // Step 1: Move all elements from queue to stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Step 2: Move back from stack to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
