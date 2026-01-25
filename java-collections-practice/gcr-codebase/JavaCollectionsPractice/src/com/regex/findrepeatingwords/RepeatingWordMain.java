package com.regex.findrepeatingwords;

public class RepeatingWordMain {

    public static void main(String[] args) {

        String text =
                "This is is a repeated repeated word test.";

        System.out.println("Repeating words:");
        RepeatingWordFinder.findRepeatingWords(text);
    }
}
