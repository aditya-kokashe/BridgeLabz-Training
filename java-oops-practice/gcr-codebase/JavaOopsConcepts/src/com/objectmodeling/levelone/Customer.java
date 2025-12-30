package com.objectmodeling.levelone;

public class Customer {
	
	String customerName;
	double balance;
	
	//constructor
	public Customer(String customerName, double balance) {
		this.customerName = customerName;
		this.balance = balance;
	}

	//view balance method
	public void viewBalance() {
		System.out.println(customerName +" Balance: "+ balance);
	}
	
}
