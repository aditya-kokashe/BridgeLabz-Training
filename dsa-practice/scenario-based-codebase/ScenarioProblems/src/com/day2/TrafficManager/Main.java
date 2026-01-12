package com.day2.TrafficManager;

public class Main {

    public static void main(String[] args) {

        TrafficManager manager = new TrafficManager();

        manager.enqueueVehicle("CAR-101");
        manager.enqueueVehicle("CAR-102");
        manager.enqueueVehicle("CAR-103");
        manager.enqueueVehicle("CAR-104");   // overflow

        manager.enterRoundabout();
        manager.enterRoundabout();
        manager.enterRoundabout();
        manager.enterRoundabout();            // underflow

        manager.displayRoundabout();

        manager.exitRoundabout("CAR-102");
        manager.displayRoundabout();
    }
}