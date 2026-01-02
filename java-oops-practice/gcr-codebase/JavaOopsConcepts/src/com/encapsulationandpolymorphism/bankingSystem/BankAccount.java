package com.encapsulationandpolymorphism.bankingSystem;

public abstract class BankAccount {

	private long accountNumber;
	private String holderName;
	protected double balance;
	
	public BankAccount(long accountNumber , String holderName, double balance) {
		this.accountNumber= accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
        if (amount>0) {
            balance += amount;
        }    
    }
	public void withdraw(double amount) {
        if (amount<=balance) {
            balance -= amount;
        }    
        else {
            System.out.println("Insufficient Balance.");
        }
    }
	
	//Abstract method
	public abstract double calculateInterest();

	public long getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }
	
	public void display() {
		System.out.println("\nAccount Number: "+ accountNumber+"\nHolder Name: "+holderName+"\nBalance: "+balance);
	}
}
