package com.inheritance.vehicleTransportSystem;

public class Car extends Vehicle{

	int seatCapacity;
	public Car(double maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	void displayInfo() {
		System.out.println("Max Speed: "+ maxSpeed+"\nFuel Type: "+ fuelType+"\nSeat Capacity: "+ seatCapacity);
	}

}
