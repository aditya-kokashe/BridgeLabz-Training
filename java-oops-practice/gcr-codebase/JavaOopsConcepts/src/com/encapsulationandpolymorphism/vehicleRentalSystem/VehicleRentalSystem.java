package com.encapsulationandpolymorphism.vehicleRentalSystem;

import com.encapsulationandpolymorphism.employeeManagementSystem.Employee;

public class VehicleRentalSystem {

	public static void main(String[] args) {
		
		Vehicle a = new Car("MP48 CG 2025", 1500, "CAR9876");
		Vehicle b = new Bike("HR26 FC 2782",  600, "BIKE2345");
		Vehicle c = new Truck("MH27 BM 5059",  4000, "TRK8765");

		a.calculateRentalCost(5);
		b.calculateRentalCost(2);
		c.calculateRentalCost(1);
		
		Vehicle[] vehicles = {a, b, c};

		//polymorphism
        for (Vehicle vehicle : vehicles) {
            vehicle.display();  
        }
	}

}
