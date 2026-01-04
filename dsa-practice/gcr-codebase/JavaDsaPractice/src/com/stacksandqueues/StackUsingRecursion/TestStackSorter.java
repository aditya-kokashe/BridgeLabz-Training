package com.stacksandqueues.StackUsingRecursion;

import java.util.Stack;
public class TestStackSorter {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        System.out.println("Before Sorting: " + stack);

        StackSorter.sortStack(stack);

        System.out.println("After Sorting: " + stack);
    }
}
