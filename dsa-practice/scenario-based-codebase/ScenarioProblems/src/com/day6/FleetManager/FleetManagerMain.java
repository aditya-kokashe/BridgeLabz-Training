package com.day6.FleetManager;

public class FleetManagerMain {

    public static void main(String[] args) {

        // Sorted vehicle lists from different depots
        Vehicle[] vehicles = {
            new Vehicle("DL01", 12000),
            new Vehicle("DL02", 18000),
            new Vehicle("MH01", 10000),
            new Vehicle("MH02", 15000),
            new Vehicle("KA01", 20000)
        };

        System.out.println("Before Creating Master Schedule:");
        for (Vehicle v : vehicles) {
            System.out.println(v.vehicleId + " -> " + v.mileage);
        }

        MergeSort.sort(vehicles, 0, vehicles.length - 1);

        System.out.println("\nMaster Maintenance Schedule:");
        for (Vehicle v : vehicles) {
            System.out.println(v.vehicleId + " -> " + v.mileage);
        }
    }
}
