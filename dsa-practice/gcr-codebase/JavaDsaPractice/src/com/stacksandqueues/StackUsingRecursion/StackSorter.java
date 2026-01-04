package com.stacksandqueues.StackUsingRecursion;

import java.util.Stack;
public class StackSorter {

    //Sort the entire stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertSorted(stack, temp);
        }
    }

    //Insert element at correct position
    public static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }
        int temp = stack.pop();
        insertSorted(stack, element);
        stack.push(temp);
    }
}
