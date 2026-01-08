package com.searching.strings;

import java.util.HashSet;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "programming";

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

        System.out.println("Without Duplicates: " + result);
    }
}
