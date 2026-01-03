package com.day1.EWalletApplication;

public class Transaction {

	protected String fromUser;
	protected String toUser;
	protected double amount;

    public Transaction(String fromUser, String toUser, double amount) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
    }

    public void showTransaction() {
        System.out.println(fromUser + " " + toUser + " : " + amount);
    }

}
