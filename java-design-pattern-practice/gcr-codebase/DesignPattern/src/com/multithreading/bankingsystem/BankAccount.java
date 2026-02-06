package com.multithreading.bankingsystem;

public class BankAccount {
    private int balance = 10000;

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }
}
