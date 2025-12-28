package com.constructor.levelone;

public class BankAccount {

	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	//Public method to modify private balance
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	public double getBalance() {
		return balance;
	}
}
