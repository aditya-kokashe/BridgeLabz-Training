package com.collections.listinterface.rotateelements;

import java.util.ArrayList;
import java.util.List;

public class RotateListMain {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        ListRotator.rotateLeft(numbers, 2);

        System.out.println("List after rotating by 2: " + numbers);
    }
}
