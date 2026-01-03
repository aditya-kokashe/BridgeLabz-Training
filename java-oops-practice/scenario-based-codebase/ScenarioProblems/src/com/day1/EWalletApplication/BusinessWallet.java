package com.day1.EWalletApplication;

public class BusinessWallet extends Wallet {

    public BusinessWallet(double balance) {
        super(balance);
        this.limit = 50000;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02;
        double total = amount + tax;

        if(total > limit) {
            System.out.println("Business limit exceeded");
            return;
        }

        if(deduct(total)) {
            receiver.wallet.add(amount);
            receiver.addTransaction(new Transaction("Business", receiver.name, amount));
            System.out.println("Business transfer successful (2% tax charged)");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
