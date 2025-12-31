package com.inheritance.bankAccountTypes;

public class SavingsAccount extends BankAccount{

	int intrestRate;
	public SavingsAccount(int accountNumber, double balance,int intrestRate) {
		super(accountNumber, balance);
		this.intrestRate= intrestRate;
	}
	public void displayAccountType(){
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Intrest Rate: "+intrestRate);
	}
}
