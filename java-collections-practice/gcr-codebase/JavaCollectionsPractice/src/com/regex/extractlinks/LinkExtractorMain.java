package com.regex.extractlinks;

public class LinkExtractorMain {

    public static void main(String[] args) {

        String text =
                "Visit https://www.google.com and http://example.org for more info.";

        System.out.println("Extracted Links:");
        LinkExtractor.extractLinks(text);
    }
}
