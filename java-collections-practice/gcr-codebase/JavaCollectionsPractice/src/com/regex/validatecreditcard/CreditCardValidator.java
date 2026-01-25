package com.regex.validatecreditcard;

import java.util.regex.Pattern;

public class CreditCardValidator {

    private static final String CARD_REGEX =
            "^(4\\d{15}|5\\d{15})$";

    public static boolean isValid(String cardNumber) {
        return Pattern.matches(CARD_REGEX, cardNumber);
    }
}
