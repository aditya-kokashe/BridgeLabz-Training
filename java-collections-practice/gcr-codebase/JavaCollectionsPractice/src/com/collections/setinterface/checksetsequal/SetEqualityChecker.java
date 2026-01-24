package com.collections.setinterface.checksetsequal;

import java.util.Set;

public class SetEqualityChecker {

    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {

        if (set1 == null || set2 == null)
            return false;

        return set1.equals(set2);
    }
}
