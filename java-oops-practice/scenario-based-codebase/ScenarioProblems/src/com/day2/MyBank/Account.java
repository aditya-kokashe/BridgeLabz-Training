package com.day2.MyBank;

public abstract class Account {

	protected long accountNumber;
	private double balance;
	protected String name;
	
	public Account(long accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance=balance;
	}
	
	public double getbalance() {
		return balance;
	}
	protected void setBalance(double balance) {
		this.balance= balance;
	}
	
	//Abstract method
	public abstract double calculateInterest();
	
	public void display() {
		System.out.println("\nAccount Number: "+ accountNumber+ "\nAccount Holder: "+ name+ "\nBalance: "+ balance);
	}
	
}
