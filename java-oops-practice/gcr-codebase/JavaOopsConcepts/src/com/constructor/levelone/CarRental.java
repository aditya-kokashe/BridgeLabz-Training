package com.constructor.levelone;

public class CarRental {
	
	//Attributes
	String customerName;
	String carModel;
	int rentalDay;
	double totalCost;
	
	//Default constructors
	public CarRental() {
		customerName = "Justin Scott";
		carModel = "Honda city";
		rentalDay = 2;
		totalCost = 1000;
	}
	
	//Parameterized constructor
	public CarRental(String customerName, String carModel, int rentalDay, int totalCost) {
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDay = rentalDay;
		this.totalCost = totalCost;
	}
	
	double calculateTotalCost() {
		return rentalDay*totalCost;
	}
	
	
	public void displayBill() {
		System.out.println("Customer: "+ customerName);
		System.out.println("Car model: "+ carModel);
		System.out.println("rental Days: "+ rentalDay);
		System.out.println("Cost per day: "+ totalCost);
		System.out.println("Total cost: "+ calculateTotalCost());
		System.out.println("-------------------------------------");
	}

}
