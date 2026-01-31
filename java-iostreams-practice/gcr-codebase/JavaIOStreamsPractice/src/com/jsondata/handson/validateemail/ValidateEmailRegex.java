package com.jsondata.handson.validateemail;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.json.JSONObject;

public class ValidateEmailRegex {

    public static void main(String[] args) {

        try {
            String path = "src/com/jsondata/handson/validateemail/user.json";
            String content = new String(Files.readAllBytes(Paths.get(path)));

            JSONObject json = new JSONObject(content);
            String email = json.getString("email");

            // Email regex
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

            boolean isValid = Pattern.matches(emailRegex, email);

            if (isValid) {
                System.out.println("Valid email: " + email);
            } else {
                System.out.println("Invalid email: " + email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
