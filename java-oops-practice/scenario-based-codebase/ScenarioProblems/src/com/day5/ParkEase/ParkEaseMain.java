package com.day5.ParkEase;

public class ParkEaseMain {

    public static void main(String[] args) {

        ParkingSlot carSlot = new ParkingSlot(101, "Zone A", "Car");
        ParkingSlot bikeSlot = new ParkingSlot(102, "Zone B", "Bike");

        Vehicle car = new Car("MP09AB1234");
        Vehicle bike = new Bike("MP09XY5678");

        carSlot.displaySlot();
        bikeSlot.displaySlot();

        System.out.println();

        if (carSlot.assignSlot(car)) {
            System.out.println("Car parked successfully");
            System.out.println("Charges: INR " + car.calculateCharges(6));
        }

        if (bikeSlot.assignSlot(bike)) {
            System.out.println("Bike parked successfully");
            System.out.println("Charges: INR " + bike.calculateCharges(3));
        }

        System.out.println();

        carSlot.displayLog();
        bikeSlot.displayLog();

        carSlot.releaseSlot();
        carSlot.displaySlot();
    }
}

