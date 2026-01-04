package com.hashmapsandfunctions.CheckForAPair;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        boolean result = PairSumChecker.hasPairWithSum(arr, target);
        if (!result) {
            System.out.println("No such pair exists.");
        }
    }
}
