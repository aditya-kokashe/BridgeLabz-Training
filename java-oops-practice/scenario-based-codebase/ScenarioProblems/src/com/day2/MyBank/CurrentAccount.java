package com.day2.MyBank;

public class CurrentAccount extends Account implements ITransaction{

	private double interestRate;
	public CurrentAccount(long accountNumber, String name, double balance, double intrestRate) {
		super(accountNumber, name,  balance);
		this.interestRate = intrestRate;
	}

	@Override
    public void deposit(double amount) {
        setBalance(getbalance() + amount);
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getbalance()) {
            setBalance(getbalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    @Override
    public double checkBalance() {
        return getbalance();
    }

    @Override
    public double calculateInterest() {
        return getbalance() * interestRate / 100;
    }
}