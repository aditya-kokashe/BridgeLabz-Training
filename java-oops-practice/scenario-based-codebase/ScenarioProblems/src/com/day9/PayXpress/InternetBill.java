package com.day9.PayXpress;

public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void pay() {
        double finalAmount = calculateLateFee(100);
        markPaid();
        System.out.println("Internet bill paid: " + finalAmount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Your internet will be suspended.");
    }
}
