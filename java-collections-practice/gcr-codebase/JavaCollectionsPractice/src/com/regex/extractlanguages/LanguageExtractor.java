package com.regex.extractlanguages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LanguageExtractor {

    private static final String LANGUAGE_REGEX =
            "\\b(Java|Python|JavaScript|Go)\\b";

    public static void extractLanguages(String text) {

        Pattern pattern = Pattern.compile(LANGUAGE_REGEX);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
