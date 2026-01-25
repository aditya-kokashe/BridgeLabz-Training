package com.regex.extractdates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {

    private static final String DATE_REGEX =
            "\\b\\d{2}/\\d{2}/\\d{4}\\b";

    public static void extractDates(String text) {

        Pattern pattern = Pattern.compile(DATE_REGEX);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
