package com.hashmapsandfunctions.LongestConsecutiveSequence;

import java.util.HashSet;
public class LongestConsecutiveSequence {
    public static int findLongestSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            // Start only if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
