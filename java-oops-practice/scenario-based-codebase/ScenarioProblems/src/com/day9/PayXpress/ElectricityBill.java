package com.day9.PayXpress;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void pay() {
        double finalAmount = calculateLateFee(50);
        markPaid();
        System.out.println("Electricity bill paid: " + finalAmount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Power will be disconnected if unpaid.");
    }
}
