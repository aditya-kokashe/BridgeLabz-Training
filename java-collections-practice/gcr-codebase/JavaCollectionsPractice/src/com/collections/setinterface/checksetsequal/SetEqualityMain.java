package com.collections.setinterface.checksetsequal;

import java.util.HashSet;
import java.util.Set;

public class SetEqualityMain {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        boolean result =
                SetEqualityChecker.areSetsEqual(set1, set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Are both sets equal? " + result);
    }
}
