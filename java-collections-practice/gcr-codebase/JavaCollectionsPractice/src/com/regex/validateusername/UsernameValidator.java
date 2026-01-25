package com.regex.validateusername;

import java.util.regex.Pattern;

public class UsernameValidator {

    private static final String USERNAME_REGEX =
            "^[A-Za-z][A-Za-z0-9_]{4,14}$";

    public static boolean isValid(String username) {
        return Pattern.matches(USERNAME_REGEX, username);
    }
}
