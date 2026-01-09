package com.day7.Artify;

public class User {

	public String name;
	private double walletBalance;
	public User(String name, double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double updatedPrice) {
		this.walletBalance = walletBalance;
	}
	
	public void displayUser() {
		System.out.println("Name: "+ name+ "\nWallet Balance: "+ walletBalance);
	}

}
