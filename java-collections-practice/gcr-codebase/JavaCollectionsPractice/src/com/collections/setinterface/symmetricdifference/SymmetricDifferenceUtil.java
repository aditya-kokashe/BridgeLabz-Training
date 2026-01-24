package com.collections.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifferenceUtil {

    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {

        Set<T> result = new HashSet<>(set1);

        // Remove common elements
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        result.removeAll(intersection);

        // Add elements unique to set2
        Set<T> temp = new HashSet<>(set2);
        temp.removeAll(set1);
        result.addAll(temp);

        return result;
    }
}
