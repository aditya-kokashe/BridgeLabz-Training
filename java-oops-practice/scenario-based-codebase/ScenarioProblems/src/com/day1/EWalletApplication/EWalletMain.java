package com.day1.EWalletApplication;

public class EWalletMain {
    public static void main(String[] args) {

        User u1 = new User("Aditya", new PersonalWallet(5000));
        User u2 = new User("Praneet", new BusinessWallet(20000));

        u1.wallet.transferTo(u2, 3000);
        u2.wallet.transferTo(u1, 5000);

        System.out.println("Aditya Balance: " + u1.wallet.getBalance());
        System.out.println("Praneet Balance: " + u2.wallet.getBalance());

        System.out.println("\nTransaction History:");
        u1.showHistory();
        u2.showHistory();
    }
}
