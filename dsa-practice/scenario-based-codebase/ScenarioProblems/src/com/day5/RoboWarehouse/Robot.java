package com.day5.RoboWarehouse;

public class Robot {

    // Insertion Sort to load packages in ascending order
    public void loadPackages(Shelf shelf) {

        int[] w = shelf.weights;

        for (int i = 1; i < w.length; i++) {
            int current = w[i];
            int j = i - 1;

            // Shift heavier packages
            while (j >= 0 && w[j] > current) {
                w[j + 1] = w[j];
                j--;
            }

            // Insert at correct position
            w[j + 1] = current;
        }
    }
}
