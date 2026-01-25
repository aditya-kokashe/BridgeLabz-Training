package com.regex.validatelicenseplate;

import java.util.regex.Pattern;

public class LicensePlateValidator {

    private static final String PLATE_REGEX = "^[A-Z]{2}[0-9]{4}$";

    public static boolean isValid(String plate) {
        return Pattern.matches(PLATE_REGEX, plate);
    }
}
