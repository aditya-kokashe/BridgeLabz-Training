package com.functionalinterface.paymentgateway;

public class CardPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid : " + amount + " using Card");
    }
}
