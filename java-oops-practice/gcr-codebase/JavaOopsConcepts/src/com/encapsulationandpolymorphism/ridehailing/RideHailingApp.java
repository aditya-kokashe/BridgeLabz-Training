package com.encapsulationandpolymorphism.ridehailing;

import java.util.*;
public class RideHailingApp {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR101", "Kapoor Khan", 15, "Bhopal"));
        vehicles.add(new Bike("BIKE202", "Rahul Mehta", 8, "Indore"));
        vehicles.add(new Auto("AUTO303", "Amit Trivedi", 12, "Ujjain"));

        double distance = 10; 	//10 km

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km = " + v.calculateFare(distance));
            System.out.println();
        }
    }
}
