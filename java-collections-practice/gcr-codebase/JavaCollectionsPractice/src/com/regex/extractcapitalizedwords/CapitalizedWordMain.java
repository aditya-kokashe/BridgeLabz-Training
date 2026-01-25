package com.regex.extractcapitalizedwords;

public class CapitalizedWordMain {

    public static void main(String[] args) {

        String sentence =
                "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        System.out.println("Capitalized Words:");
        CapitalizedWordExtractor.extractWords(sentence);
    }
}
