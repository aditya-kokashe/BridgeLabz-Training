package com.functionalinterface.stringlengthchecker;

import java.util.function.Function;

public class StringLengthCheckerMain {

    public static void main(String[] args) {

        int characterLimit = 20;
        String message = "Hello my name is Ankit";

        Function<String, Integer> stringLength =
                str -> str.length();

        int length = stringLength.apply(message);

        if (length > characterLimit) {
            System.out.println("Exceed character limit");
        } else {
            System.out.println("Message is within character limit");
        }

        System.out.println("Message length: " + length);
    }
}
