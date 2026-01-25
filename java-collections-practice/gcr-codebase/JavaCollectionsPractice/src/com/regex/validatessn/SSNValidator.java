package com.regex.validatessn;

import java.util.regex.Pattern;

public class SSNValidator {

    private static final String SSN_REGEX =
            "^\\d{3}-\\d{2}-\\d{4}$";

    public static boolean isValid(String ssn) {
        return Pattern.matches(SSN_REGEX, ssn);
    }
}
