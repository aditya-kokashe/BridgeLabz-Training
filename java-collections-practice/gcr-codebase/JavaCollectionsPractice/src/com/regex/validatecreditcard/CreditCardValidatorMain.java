package com.regex.validatecreditcard;

public class CreditCardValidatorMain {

    public static void main(String[] args) {

        String[] cards = {
                "4123456789012345", // Visa
                "5123456789012345", // MasterCard
                "6123456789012345", // Invalid
                "41234567890"       // Invalid
        };

        for (String card : cards) {
            System.out.println(
                    card + " → " +
                    (CreditCardValidator.isValid(card)
                            ? "Valid"
                            : "Invalid")
            );
        }
    }
}
