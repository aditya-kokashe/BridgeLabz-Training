package com.inheritance.bankAccountTypes;

public class FixedDepositAccount extends BankAccount{

	
	public FixedDepositAccount(int accountNumber, double balance ) {
		super(accountNumber, balance);
	}
	public void displayAccountType(){
		System.out.println("\nAccount Number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
}
