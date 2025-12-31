package com.inheritance.bankAccountTypes;

public class BankAccount {

	int accountNumber;
	double balance;
	public BankAccount(int accountNumber, double balance) {

		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void displayAccountType(){
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}

}
