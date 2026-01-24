package com.collections.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseListMain {

    public static void main(String[] args) {

        // ArrayList example
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println("Original ArrayList: " + arrayList);
        ReverseListUtil.reverse(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        System.out.println();

        // LinkedList example
        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        System.out.println("Original LinkedList: " + linkedList);
        ReverseListUtil.reverse(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
