package com.day1.VehicleRentalApplication;

public class Car extends Vehicle implements Rentable{

	public Car(String vehicleNumber, String type, double baseRate) {
		super(vehicleNumber, "Car", 200);
	}

	@Override
	public double calculateRent(int days) {
		return baseRate*days+20;
	}

}
