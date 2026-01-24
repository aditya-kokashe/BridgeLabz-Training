package com.collections.listinterface.nthfromend;

import java.util.LinkedList;

public class NthElementFinder {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {

        if (list == null || n <= 0)
            return null;

        int slow = 0;
        int fast = 0;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast >= list.size())
                return null; // n is greater than list length
            fast++;
        }

        // Move both pointers until fast reaches end
        while (fast < list.size()) {
            slow++;
            fast++;
        }

        return list.get(slow);
    }
}
