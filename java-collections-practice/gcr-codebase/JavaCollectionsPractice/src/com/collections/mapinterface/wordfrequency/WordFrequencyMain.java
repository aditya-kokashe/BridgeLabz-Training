package com.collections.mapinterface.wordfrequency;

import java.util.Map;

public class WordFrequencyMain {

    public static void main(String[] args) {

        String input = "Hello world, hello Java!";

        Map<String, Integer> result =
                WordFrequencyCounter.countWords(input);

        System.out.println("Input: " + input);
        System.out.println("Word Frequency: " + result);
    }
}
