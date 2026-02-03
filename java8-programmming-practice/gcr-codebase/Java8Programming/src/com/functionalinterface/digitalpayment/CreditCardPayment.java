package com.functionalinterface.digitalpayment;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid : " + amount + " using Card");
    }
}
