package com.collections.mapinterface.wordfrequency;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static Map<String, Integer> countWords(String text) {

        Map<String, Integer> frequencyMap = new HashMap<>();

        // convert to lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) continue;

            frequencyMap.put(word,
                    frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }
}
