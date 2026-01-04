package com.hashmapsandfunctions.CheckForAPair;

import java.util.HashMap;
public class PairSumChecker {

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int required = target - num;
            if (map.containsKey(required)) {
                System.out.println("Pair Found: " + required + " + " + num + " = " + target);
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }
}
