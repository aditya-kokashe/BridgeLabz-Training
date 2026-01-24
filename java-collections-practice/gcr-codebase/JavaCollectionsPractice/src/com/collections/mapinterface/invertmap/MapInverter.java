package com.collections.mapinterface.invertmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapInverter {

    public static <K, V> Map<V, List<K>> invert(Map<K, V> originalMap) {

        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {

            V value = entry.getValue();
            K key = entry.getKey();

            invertedMap
                    .computeIfAbsent(value, k -> new ArrayList<>())
                    .add(key);
        }

        return invertedMap;
    }
}
