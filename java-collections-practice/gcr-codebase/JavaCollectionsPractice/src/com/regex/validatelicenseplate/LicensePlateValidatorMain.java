package com.regex.validatelicenseplate;

public class LicensePlateValidatorMain {

    public static void main(String[] args) {

        String[] plates = {
                "AB1234",
                "A12345",
                "ab1234",
                "AB123"
        };

        for (String plate : plates) {
            System.out.println(
                    plate + " → " +
                    (LicensePlateValidator.isValid(plate)
                            ? "Valid"
                            : "Invalid")
            );
        }
    }
}
