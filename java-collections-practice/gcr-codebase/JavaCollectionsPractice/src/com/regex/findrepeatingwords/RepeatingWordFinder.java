package com.regex.findrepeatingwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWordFinder {

    private static final String REPEAT_REGEX =
            "\\b(\\w+)\\s+\\1\\b";

    public static void findRepeatingWords(String text) {

        Pattern pattern = Pattern.compile(REPEAT_REGEX, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
