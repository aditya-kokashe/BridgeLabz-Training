package com.day9.PayXpress;

public abstract class Bill implements IPayable {

    private String type;
    private double amount;
    private String dueDate;
    private boolean isPaid;

    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    protected void markPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
