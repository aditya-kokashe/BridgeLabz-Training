package com.day1.EWalletApplication;

public abstract class Wallet implements Transferrable {
    private double balance;     // Encapsulated
    protected double limit;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    protected boolean deduct(double amount) {
        if(amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    protected void add(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
