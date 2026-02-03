package com.functionalinterface.multivehiclerental;

public class Bus implements RentalVehicle {

    @Override
    public void rent() {
        System.out.println("Bus rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}
