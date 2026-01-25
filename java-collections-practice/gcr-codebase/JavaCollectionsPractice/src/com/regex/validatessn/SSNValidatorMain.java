package com.regex.validatessn;

public class SSNValidatorMain {

    public static void main(String[] args) {

        String valid = "123-45-6789";
        String invalid = "123456789";

        System.out.println(valid + " → " +
                (SSNValidator.isValid(valid) ? "Valid" : "Invalid"));

        System.out.println(invalid + " → " +
                (SSNValidator.isValid(invalid) ? "Valid" : "Invalid"));
    }
}
