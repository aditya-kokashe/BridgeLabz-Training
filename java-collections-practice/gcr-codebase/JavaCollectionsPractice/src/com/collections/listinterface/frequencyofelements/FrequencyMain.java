package com.collections.listinterface.frequencyofelements;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FrequencyMain {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        Map<String, Integer> result =
                FrequencyCounter.countFrequency(fruits);

        System.out.println("Input List: " + fruits);
        System.out.println("Frequency Map: " + result);
    }
}
