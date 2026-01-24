package com.collections.setinterface.settosortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SetToSortedListUtil {

    public static List<Integer> convertAndSort(Set<Integer> set) {

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }
}
