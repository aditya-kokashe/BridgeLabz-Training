package com.searching.strings;

public class ConcatArrayOfStrings {
    public static void main(String[] args) {
        String[] arr = {"Hello", " ", "Mr.", " ", "Mohit"};

        StringBuffer sb = new StringBuffer();

        for (String s : arr) {
            sb.append(s);
        }

        System.out.println(sb.toString());
    }
}
