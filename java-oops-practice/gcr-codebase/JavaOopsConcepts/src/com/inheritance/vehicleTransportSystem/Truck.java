package com.inheritance.vehicleTransportSystem;

public class Truck extends Vehicle{

	int truckSeats;
	public Truck(double maxSpeed, String fuelType, int truckSeats) {
		// TODO Auto-generated constructor stub
		super(maxSpeed, fuelType);
		this.truckSeats = truckSeats;
	}
	void displayInfo() {
		System.out.println("\nMax Speed: "+ maxSpeed+"\nFuel Type: "+ fuelType+"\nTruck Seats: "+ truckSeats);
	}
}
