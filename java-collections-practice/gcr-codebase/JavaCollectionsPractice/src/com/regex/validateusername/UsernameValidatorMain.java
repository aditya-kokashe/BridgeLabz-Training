package com.regex.validateusername;

public class UsernameValidatorMain {

    public static void main(String[] args) {

        String[] usernames = {
                "user_123",
                "123user",
                "us",
                "Valid_User1"
        };

        for (String username : usernames) {
            System.out.println(
                    username + " → " +
                    (UsernameValidator.isValid(username)
                            ? "Valid"
                            : "Invalid")
            );
        }
    }
}
