package com.regex.extractcurrency;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor {

    private static final String CURRENCY_REGEX =
            "\\$?\\d+\\.\\d{2}";

    public static void extractCurrency(String text) {

        Pattern pattern = Pattern.compile(CURRENCY_REGEX);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
