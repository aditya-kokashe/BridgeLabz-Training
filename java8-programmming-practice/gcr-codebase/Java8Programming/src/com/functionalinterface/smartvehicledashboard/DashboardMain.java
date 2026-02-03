package com.functionalinterface.smartvehicledashboard;

public class DashboardMain {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle ev = new ElectricCar();

        car.displaySpeed();
        car.displayBatteryStatus();

        ev.displaySpeed();
        ev.displayBatteryStatus();
    }
}
