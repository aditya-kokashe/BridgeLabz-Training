package com.functionalinterface.passwordvalidator;

public class PasswordValidatorMain {

    public static void main(String[] args) {

        String password = "Password@12345";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
    }
}
