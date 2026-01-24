package com.collections.listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesMain {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Original List: " + numbers);

        List<Integer> uniqueList =
                DuplicateRemover.removeDuplicates(numbers);

        System.out.println("After Removing Duplicates: " + uniqueList);
    }
}
