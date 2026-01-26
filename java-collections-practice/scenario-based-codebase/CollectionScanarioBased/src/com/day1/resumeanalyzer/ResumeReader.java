package com.day1.resumeanalyzer;

import java.io.*;
import java.util.regex.*;

public class ResumeReader {

    private static final String EMAIL_REGEX =
            "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

    private static final String PHONE_REGEX =
            "\\b\\d{10}\\b";

    private static final String KEYWORD_REGEX =
            "\\b(Java|Python|Spring)\\b";

    public static ResumeData readResume(File file) throws IOException {

        if (!file.getName().endsWith(".txt")) {
            throw new IOException("Unsupported file format");
        }

        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(" ");
            }
        }

        String text = content.toString();

        String email = extractFirstMatch(text, EMAIL_REGEX);
        String phone = extractFirstMatch(text, PHONE_REGEX);

        if (email == null) {
            throw new IllegalArgumentException("Invalid resume: Email not found");
        }

        int keywordCount = countMatches(text, KEYWORD_REGEX);

        return new ResumeData(email, phone, keywordCount);
    }

    private static String extractFirstMatch(String text, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(text);
        return matcher.find() ? matcher.group() : null;
    }

    private static int countMatches(String text, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}