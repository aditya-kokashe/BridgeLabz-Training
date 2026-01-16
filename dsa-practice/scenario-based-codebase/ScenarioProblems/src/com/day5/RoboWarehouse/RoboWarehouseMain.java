package com.day5.RoboWarehouse;

public class RoboWarehouseMain {

    public static void main(String[] args) {

        int[] packageWeights = {25, 10, 30, 15, 20};

        Shelf shelf = new Shelf(packageWeights);
        Robot robot = new Robot();

        System.out.println("Before loading:");
        shelf.displayShelf();

        robot.loadPackages(shelf);

        System.out.println("After loading (Balanced Shelf):");
        shelf.displayShelf();
    }
}
