package com.regex.replacespaces;

public class ReplaceSpacesMain {

    public static void main(String[] args) {

        String input = "This   is   an example   with   multiple   spaces.";

        String output = SpaceNormalizer.normalizeSpaces(input);

        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
    }
}
