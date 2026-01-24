package com.collections.mapinterface.invertmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMapMain {

    public static void main(String[] args) {

        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> result =
                MapInverter.invert(input);

        System.out.println("Original Map: " + input);
        System.out.println("Inverted Map: " + result);
    }
}
