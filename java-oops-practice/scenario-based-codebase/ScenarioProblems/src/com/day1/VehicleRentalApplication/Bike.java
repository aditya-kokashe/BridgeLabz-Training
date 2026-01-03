package com.day1.VehicleRentalApplication;

public class Bike extends Vehicle implements Rentable{

	public Bike(String vehicleNumber, String type, double baseRate) {
		super(vehicleNumber, "Bike", 100);
	}

	@Override
	public double calculateRent(int days) {
		return baseRate*days+10;
	}
}
