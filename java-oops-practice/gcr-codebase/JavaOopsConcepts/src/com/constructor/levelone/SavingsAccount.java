package com.constructor.levelone;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(int accountNumber, String accountHolder, double balance) {
		super (accountNumber, accountHolder, balance);
	}
	

	public void displayDetails() {
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Holder: "+ accountHolder);
		System.out.println("Balance: "+ getBalance());
	}

}
