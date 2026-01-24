package com.collections.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifferenceMain {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> result =
                SymmetricDifferenceUtil.symmetricDifference(set1, set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Symmetric Difference: " + result);
    }
}
