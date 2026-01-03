package com.day1.VehicleRentalApplication;

public interface Rentable {
	
	public default double calculateRent() {
		return 0;
	}

	double calculateRent(int days);
}
