package com.collections.setinterface.subsetcheck;

import java.util.HashSet;
import java.util.Set;

public class SubsetCheckerMain {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        boolean result =
                SubsetChecker.isSubset(set1, set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Is Set1 a subset of Set2? " + result);
    }
}
