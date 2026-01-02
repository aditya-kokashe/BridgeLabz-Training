package com.encapsulationandpolymorphism.bankingSystem;

public class CurrentAccount extends BankAccount{

	public CurrentAccount(long accountNumber , String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	@Override
	public double calculateInterest() {
		return balance * 0.02;	//2% interest
	}
}
