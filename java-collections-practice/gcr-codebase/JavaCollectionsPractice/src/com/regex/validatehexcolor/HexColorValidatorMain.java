package com.regex.validatehexcolor;

public class HexColorValidatorMain {

    public static void main(String[] args) {

        String[] colors = {
                "#FFA500",
                "#ff4500",
                "#123",
                "#ZZZZZZ"
        };

        for (String color : colors) {
            System.out.println(
                    color + " → " +
                    (HexColorValidator.isValid(color)
                            ? "Valid"
                            : "Invalid")
            );
        }
    }
}
