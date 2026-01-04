package com.stacksandqueues.SlidingWindowMaximum;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] maxValues = SlidingWindowMaximum.findMax(arr, k);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Window Maximums: " + Arrays.toString(maxValues));
    }
}
