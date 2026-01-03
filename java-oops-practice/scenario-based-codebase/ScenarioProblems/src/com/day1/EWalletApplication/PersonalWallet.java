package com.day1.EWalletApplication;

public class PersonalWallet extends Wallet {

    public PersonalWallet(double balance) {
        super(balance);
        this.limit = 10000;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if(amount > limit) {
            System.out.println("Transfer limit exceeded!");
            return;
        }

        if(deduct(amount)) {
            receiver.wallet.add(amount);
            receiver.addTransaction(new Transaction("Personal", receiver.name, amount));
            System.out.println("Personal transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
