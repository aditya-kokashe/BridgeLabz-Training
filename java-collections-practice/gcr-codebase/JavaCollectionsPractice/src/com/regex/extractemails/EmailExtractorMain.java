package com.regex.extractemails;

public class EmailExtractorMain {

    public static void main(String[] args) {

        String text =
                "Contact us at support@example.com and info@company.org";

        System.out.println("Extracted Emails:");
        EmailExtractor.extractEmails(text);
    }
}
