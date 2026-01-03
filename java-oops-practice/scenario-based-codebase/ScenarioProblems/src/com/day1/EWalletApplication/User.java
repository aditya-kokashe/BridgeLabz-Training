package com.day1.EWalletApplication;

import java.util.*;
public class User {
    String name;
    Wallet wallet;
    List<Transaction> history = new ArrayList<>();

    public User(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public void addTransaction(Transaction t) {
        history.add(t);
    }

    public void showHistory() {
        for(Transaction t : history) {
            t.showTransaction();
        }
    }
}
