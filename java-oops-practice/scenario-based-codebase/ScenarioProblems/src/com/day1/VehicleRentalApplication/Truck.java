package com.day1.VehicleRentalApplication;

public class Truck extends Vehicle implements Rentable{

	public Truck(String vehicleNumber, String type, double baseRate) {
		super(vehicleNumber,"Truck", 500);
	}

	@Override
	public double calculateRent(int days) {
		return baseRate*days+100;
	}
}
