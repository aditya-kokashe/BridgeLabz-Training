package com.collections.listinterface.nthfromend;

import java.util.LinkedList;

public class NthFromEndMain {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;

        System.out.println("List: " + list);

        String result =
                NthElementFinder.findNthFromEnd(list, n);

        System.out.println("Nth element from end (N = " + n + "): " + result);
    }
}
