package com.inheritance.bankAccountTypes;

public class CheckingAccount extends BankAccount{

	int withdrawalLimit ;
	public CheckingAccount(int accountNumber, double balance, int withdrawalLimit ) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit ;
	}
	public void displayAccountType(){
		System.out.println("\nAccount Number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Withdrawal Limit : "+withdrawalLimit );
	}
}
