package com.constructor.levelone;

public class CarRentalMain {

	public static void main(String[] args) {
		
		//Default constructor
		CarRental c1 = new CarRental();
		c1.displayBill();
		
		//Parameterized constructor
		CarRental c2 = new CarRental("Abhishek" , "Audi", 1, 2000);
		c2.displayBill();
	}

}
