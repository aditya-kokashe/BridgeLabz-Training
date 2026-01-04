package com.stacksandqueues.StockSpanProblem;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] price = {100, 80, 60, 70, 60, 75, 85};

        int[] span = StockSpan.calculateSpan(price);

        System.out.println("Stock Prices: " + Arrays.toString(price));
        System.out.println("Span Values : " + Arrays.toString(span));
    }
}
