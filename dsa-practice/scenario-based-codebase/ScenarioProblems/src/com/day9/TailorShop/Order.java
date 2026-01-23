package com.day9.TailorShop;

public class Order {

    String orderId;
    //days remaining
    int deliveryDeadline;

    public Order(String orderId, int deliveryDeadline) {
        this.orderId = orderId;
        this.deliveryDeadline = deliveryDeadline;
    }

    @Override
    public String toString() {
        return orderId + " - Deadline (days): " + deliveryDeadline;
    }
}