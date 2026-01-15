package com.day9.PayXpress;

public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() {
        double finalAmount = calculateLateFee(30);
        markPaid();
        System.out.println("Water bill paid: " + finalAmount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Please clear your water dues.");
    }
}
