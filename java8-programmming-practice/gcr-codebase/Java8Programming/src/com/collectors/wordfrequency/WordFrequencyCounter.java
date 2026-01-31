package com.collectors.wordfrequency;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "java streams make java powerful and streams make code clean";

        Map<String, Integer> wordCount =
                Arrays.stream(paragraph.split("\\s+"))
                      .collect(Collectors.toMap(
                              word -> word,    // key
                              word -> 1,       // value
                              Integer::sum     // merge duplicates
                      ));

        System.out.println(wordCount);
    }
}
