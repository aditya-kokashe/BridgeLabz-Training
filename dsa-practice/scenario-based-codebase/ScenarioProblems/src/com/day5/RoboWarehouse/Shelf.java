package com.day5.RoboWarehouse;

public class Shelf {

    int[] weights;

    // Constructor
    public Shelf(int[] weights) {
        this.weights = weights;
    }

    // Display shelf contents
    public void displayShelf() {
        for (int w : weights) {
            System.out.print(w + " ");
        }
        System.out.println();
    }
}
