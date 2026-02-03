package com.functionalinterface.smartvehicledashboard;

public class ElectricCar implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Electric car speed: 90 km per hrs");
    }

    @Override
    public void displayBatteryStatus() {
        System.out.println("Battery level: 75%");
    }
}
