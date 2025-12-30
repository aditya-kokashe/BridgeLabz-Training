package com.objectmodeling.levelone;

public class Bank {

	public String bankName;
	
	//constructor
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	//open account method
	public void openAccount(Customer customer) {
		System.out.println("Account opened for: "+customer.customerName+ " \nin "+ bankName);
	}

}
