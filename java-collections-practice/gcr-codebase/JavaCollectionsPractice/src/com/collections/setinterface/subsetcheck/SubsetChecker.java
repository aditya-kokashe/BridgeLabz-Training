package com.collections.setinterface.subsetcheck;

import java.util.Set;

public class SubsetChecker {

    public static <T> boolean isSubset(Set<T> set1, Set<T> set2) {

        return set2.containsAll(set1);
    }
}
