package com.inheritance.vehicleTransportSystem;

public class Vehicle {

	double maxSpeed;
	String fuelType;
	public Vehicle(double maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	void displayInfo() {
		System.out.println("\nMax Speed: "+ maxSpeed+"\nFuel Type: "+ fuelType);
	}

}
