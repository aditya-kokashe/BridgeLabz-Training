package com.multithreading.bankingsystem;

import java.time.LocalTime;

class Transaction implements Runnable {
    private BankAccount account;
    private int amount;
    private String customer;

    public Transaction(BankAccount account, int amount, String customer) {
        this.account = account;
        this.amount = amount;
        this.customer = customer;
    }

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() +
                "] Attempting to withdraw " + amount);

        boolean success = account.withdraw(amount);

        if (success) {
            System.out.println("Transaction successful: " + customer +
                    ", Amount: " + amount +
                    ", Balance: " + account.getBalance() +
                    ", Time: " + LocalTime.now());
        } else {
            System.out.println("Transaction failed: " + customer +
                    ", Amount: " + amount +
                    ", Time: " + LocalTime.now());
        }
    }
}

