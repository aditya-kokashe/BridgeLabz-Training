package com.streamapi.nametransformation;

import java.util.Arrays;
import java.util.List;

public class NameTransformationMain {

    public static void main(String[] args) {

        List<String> customerNames = Arrays.asList(
                "priya",
                "kartik",
                "rahul",
                "rohan",
                "anand"
        );

        System.out.println("Transformed names:");

        customerNames.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
