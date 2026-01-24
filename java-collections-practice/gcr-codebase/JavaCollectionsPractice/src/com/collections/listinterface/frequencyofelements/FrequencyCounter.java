package com.collections.listinterface.frequencyofelements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {

    public static Map<String, Integer> countFrequency(List<String> list) {

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(item, frequencyMap.get(item) + 1);
            } else {
                frequencyMap.put(item, 1);
            }
        }

        return frequencyMap;
    }
}
