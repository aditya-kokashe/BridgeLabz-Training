package com.regex.validateipaddress;

import java.util.regex.Pattern;

public class IPAddressValidator {

    private static final String IP_REGEX =
            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}" +
            "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

    public static boolean isValid(String ip) {
        return Pattern.matches(IP_REGEX, ip);
    }
}
