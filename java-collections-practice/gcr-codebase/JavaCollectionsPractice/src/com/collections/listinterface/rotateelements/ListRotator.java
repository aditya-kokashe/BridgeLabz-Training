package com.collections.listinterface.rotateelements;

import java.util.List;

public class ListRotator {

    // Left rotate list by k positions
    public static <T> void rotateLeft(List<T> list, int k) {

        int n = list.size();
        if (n == 0) return;

        k = k % n; // handle rotations > size

        for (int i = 0; i < k; i++) {
            T first = list.remove(0);
            list.add(first);
        }
    }
}
