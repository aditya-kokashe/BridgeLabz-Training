package com.algorithmsoptimization.ComparingDataStructures;

import java.util.*;

public class SearchStructureMain {

    public static void main(String[] args) {

        int[] sizes = {1000, 100000, 1_000_000};

        ArraySearch a = new ArraySearch();
        HashSetSearch h = new HashSetSearch();
        TreeSetSearch t = new TreeSetSearch();

        for(int n : sizes) {

            int[] arr = new int[n];
            HashSet<Integer> hs = new HashSet<>();
            TreeSet<Integer> ts = new TreeSet<>();

            for(int i = 0; i < n; i++) {
                arr[i] = i;
                hs.add(i);
                ts.add(i);
            }

            int target = n - 1;

            System.out.println("Dataset Size: " + n);

            long start = System.nanoTime();
            a.search(arr, target);
            long end = System.nanoTime();
            System.out.println("Array Search: " + (end-start)/1_000_000 + " ms");

            start = System.nanoTime();
            h.search(hs, target);
            end = System.nanoTime();
            System.out.println("HashSet Search: " + (end-start)/1_000_000 + " ms");

            start = System.nanoTime();
            t.search(ts, target);
            end = System.nanoTime();
            System.out.println("TreeSet Search: " + (end-start)/1_000_000 + " ms");

            System.out.println("-------------------------------------");
        }
    }
}
