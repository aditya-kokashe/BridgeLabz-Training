package com.day8.FoodFest;

public class FoodFestMain {

    public static void main(String[] args) {

        Stall[] stalls = {
                new Stall("Burger Hub", 1200),
                new Stall("Pizza Point", 1800),
                new Stall("Taco Town", 1500),
                new Stall("Sweet Treats", 1800)
        };

        FoodFest ff = new FoodFest();
        ff.mergeSort(stalls, 0, stalls.length - 1);

        System.out.println("Stalls Sorted by Footfall:\n");
        for (Stall s : stalls)
            System.out.println(s);
    }
}