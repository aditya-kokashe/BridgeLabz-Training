package com.constructor.levelone;

public class Vehicle {
	//Instance variable
	String ownerName;
	String vehicleType;
	
	//class variable
	static double registrationFee = 1000;
	
	//Constructor
	public Vehicle(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}

	//Instance method
	void displayVehicleDetails() {
		System.out.println("Owner Name: "+ ownerName);
		System.out.println("Vehicle Type: "+ vehicleType);
		System.out.println("Registration fee: "+ registrationFee);
	}
	
	//Class method
	static void updateRegistrationFee(double newFee) {
		registrationFee = newFee;
	}
}
