package com.day2.MyBank;

public interface ITransaction {
	public void deposit(double amount);
	public void withdraw(double amount);
	public double checkBalance();
}
