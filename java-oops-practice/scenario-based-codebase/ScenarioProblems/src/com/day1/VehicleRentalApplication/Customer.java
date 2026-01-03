package com.day1.VehicleRentalApplication;

public class Customer {

	int custId;
	String name;
	public Customer(int custId, String name) {
		this.custId = custId;
		this.name = name;
	}
	
	public void displayDetails() {
		System.out.println("\nCustomer Id: "+ custId+ "\nCustomer Name: "+ name);
	}
}
