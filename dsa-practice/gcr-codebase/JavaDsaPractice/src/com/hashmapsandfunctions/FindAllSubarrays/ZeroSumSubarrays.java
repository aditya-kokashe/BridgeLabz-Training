package com.hashmapsandfunctions.FindAllSubarrays;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {
    	
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        //For handling subarrays starting from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println("Subarray found from index "
                            + (startIndex + 1) + " to " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }
}
