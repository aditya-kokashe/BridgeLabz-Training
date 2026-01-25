package com.regex.extractdates;

public class DateExtractorMain {

    public static void main(String[] args) {

        String text =
                "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        System.out.println("Extracted Dates:");
        DateExtractor.extractDates(text);
    }
}
