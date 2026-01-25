package com.annotations.suppressunchecked;

import java.util.ArrayList;

public class SuppressMain {

    public static void main(String[] args) {

        UncheckedExample example = new UncheckedExample();
        ArrayList list = example.createList();

        System.out.println(list);
    }
}