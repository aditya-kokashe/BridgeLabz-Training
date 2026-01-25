package com.regex.extractlinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {

    private static final String LINK_REGEX =
            "https?://[^\\s]+";

    public static void extractLinks(String text) {

        Pattern pattern = Pattern.compile(LINK_REGEX);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
