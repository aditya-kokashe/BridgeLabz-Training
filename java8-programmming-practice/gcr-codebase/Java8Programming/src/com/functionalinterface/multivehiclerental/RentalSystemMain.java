package com.functionalinterface.multivehiclerental;

public class RentalSystemMain {

    public static void main(String[] args) {

        RentalVehicle car = new Car();
        RentalVehicle bike = new Bike();
        RentalVehicle bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
