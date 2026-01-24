package com.collections.listinterface.reverselist;

import java.util.List;

public class ReverseListUtil {

    // Generic method to reverse any List
    public static <T> void reverse(List<T> list) {

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            T temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }
}
