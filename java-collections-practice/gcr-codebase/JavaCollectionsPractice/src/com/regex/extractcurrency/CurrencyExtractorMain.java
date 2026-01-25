package com.regex.extractcurrency;

public class CurrencyExtractorMain {

    public static void main(String[] args) {

        String text =
                "The price is $45.99, and the discount is 10.50.";

        System.out.println("Extracted Currency Values:");
        CurrencyExtractor.extractCurrency(text);
    }
}
