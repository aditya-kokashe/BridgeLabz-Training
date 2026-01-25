package com.regex.extractlanguages;

public class LanguageExtractorMain {

    public static void main(String[] args) {

        String text =
                "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        System.out.println("Extracted Programming Languages:");
        LanguageExtractor.extractLanguages(text);
    }
}
