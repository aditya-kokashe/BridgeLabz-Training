package com.inheritance.vehicleMgmtSystem;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle a = new ElectricVehicle ("Honda", 120);
		Vehicle b = new PetrolVehicle  ("Audi", 150);

		a.charge();
		b.refuel();
	}

}
