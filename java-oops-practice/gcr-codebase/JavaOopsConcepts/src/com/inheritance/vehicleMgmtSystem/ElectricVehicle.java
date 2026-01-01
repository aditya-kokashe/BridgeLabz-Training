package com.inheritance.vehicleMgmtSystem;

public class ElectricVehicle extends Vehicle {

	public ElectricVehicle(String model, int maxSpeed) {
		super(model, maxSpeed);
		
	}
	
	public void charge() {
		System.out.println("\nThis is a Electric vehicle."+"\nModel: "+ model+ "\nMax Speed: "+ maxSpeed);
	}


}
