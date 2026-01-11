package com.algorithmsoptimization.SearchTarget;

public class SearchMain {

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        LinearSearch ls = new LinearSearch();
        BinarySearch bs = new BinarySearch();

        for (int n : sizes) {
            int[] data = new int[n];
            for (int i = 0; i < n; i++)
                data[i] = i + 1;

            int target = n;

            long start = System.nanoTime();
            ls.search(data, target);
            long end = System.nanoTime();
            long linearTime = (end - start) / 1_000_000;

            start = System.nanoTime();
            bs.search(data, target);
            end = System.nanoTime();
            long binaryTime = (end - start) / 1_000_000;

            System.out.println("Dataset Size: " + n);
            System.out.println("Linear Search: " + linearTime + " ms");
            System.out.println("Binary Search: " + binaryTime + " ms");
            System.out.println("--------------------------------");
        }
    }
}
