package com.collections.setinterface.settosortedlist;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedListMain {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        List<Integer> sortedList =
                SetToSortedListUtil.convertAndSort(set);

        System.out.println("Original Set: " + set);
        System.out.println("Sorted List: " + sortedList);
    }
}
