package com.regex.validatehexcolor;

import java.util.regex.Pattern;

public class HexColorValidator {

    private static final String HEX_COLOR_REGEX =
            "^#[0-9A-Fa-f]{6}$";

    public static boolean isValid(String color) {
        return Pattern.matches(HEX_COLOR_REGEX, color);
    }
}
