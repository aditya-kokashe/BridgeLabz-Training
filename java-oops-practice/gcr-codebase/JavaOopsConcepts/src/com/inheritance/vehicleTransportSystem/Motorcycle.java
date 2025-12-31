package com.inheritance.vehicleTransportSystem;

public class Motorcycle extends Vehicle{

	String name;
	public Motorcycle(double maxSpeed, String fuelType, String name) {
		super(maxSpeed, fuelType);
		this.name = name;
	}
	
	void displayInfo() {
		System.out.println("\nMax Speed: "+ maxSpeed+"\nFuel Type: "+ fuelType+"\nCompany Name: "+ name);
	}

}
