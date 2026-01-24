package com.collections.mapinterface.maxvaluekey;

import java.util.HashMap;
import java.util.Map;

public class MaxValueKeyMain {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String result =
                MaxValueKeyFinder.findKeyWithMaxValue(map);

        System.out.println("Map: " + map);
        System.out.println("Key with highest value: " + result);
    }
}
