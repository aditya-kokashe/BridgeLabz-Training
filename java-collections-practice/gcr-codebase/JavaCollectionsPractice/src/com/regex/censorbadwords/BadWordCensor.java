package com.regex.censorbadwords;

public class BadWordCensor {

    public static String censor(String text) {

        String badWordsRegex = "\\b(damn|stupid)\\b";
        return text.replaceAll(badWordsRegex, "****");
    }
}
