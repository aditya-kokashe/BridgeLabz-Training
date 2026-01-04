package com.stacksandqueues.StockSpanProblem;

import java.util.Stack;
public class StockSpan {
    public static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();
        //First day span is always 1
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && price[i] >= price[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }

        return span;
    }
}
