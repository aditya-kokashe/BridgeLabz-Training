package com.day1.VehicleRentalApplication;

public class VehicleRentalMain {

	public static void main(String[] args) {

		Vehicle b = new Bike("Bike101", null, 0);
		Vehicle c = new Car("Car101", null,  0);
		Vehicle t = new Truck("Truck101", null, 0);
		
		Customer cust = new Customer(2021, "Maharaj");
		
		cust.displayDetails();
		
		Vehicle[] vehicles = {b,c,t};
		
		for(Vehicle v : vehicles) {
			if(v instanceof Rentable) {
				v.display();
				System.out.println("Total rent is: "+ ((Rentable) v).calculateRent(2));
			}
		}
	}

}
