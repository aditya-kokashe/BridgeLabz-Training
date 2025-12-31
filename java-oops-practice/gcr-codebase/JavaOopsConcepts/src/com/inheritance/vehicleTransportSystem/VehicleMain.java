package com.inheritance.vehicleTransportSystem;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle car = new Car(100, "Petrol", 4);
		Vehicle truck = new Truck(300, "Diesel", 10);
		Vehicle motorcycle = new Motorcycle(120, "Petrol", "Honda");
		
		car.displayInfo();
		truck.displayInfo();
		motorcycle.displayInfo();
	}

}
