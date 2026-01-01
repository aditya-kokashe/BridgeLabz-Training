package com.inheritance.vehicleMgmtSystem;

public class PetrolVehicle extends Vehicle implements Refuelable {

	public PetrolVehicle(String model, int maxSpeed) {
		super(model, maxSpeed);
		
	}
	
	public void refuel() {
		System.out.println("\nThis is a refuelable vehicle."+"\nModel: "+ model+ "\nMax Speed: "+ maxSpeed);
	}


}
