package com.regex.censorbadwords;

public class CensorBadWordsMain {

    public static void main(String[] args) {

        String input =
                "This is a damn bad example with some stupid words.";

        String output = BadWordCensor.censor(input);

        System.out.println("Original: " + input);
        System.out.println("Censored: " + output);
    }
}
