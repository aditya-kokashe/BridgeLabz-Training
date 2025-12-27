package com.constructor.levelone;

public class VehicleMain {

	public static void main(String[] args) {

		//create objects
		Vehicle v1 = new Vehicle("Andrew" , "Two wheeler");
		Vehicle v2 = new Vehicle("Betty" , "Four wheeler");

		//Call instance variables
		v1.displayVehicleDetails();
		System.out.println();
		v2.displayVehicleDetails();
		System.out.println();
		
		//update the registration fee
		Vehicle.updateRegistrationFee(2000);
		
		v1.displayVehicleDetails();
		System.out.println();
	}

}
