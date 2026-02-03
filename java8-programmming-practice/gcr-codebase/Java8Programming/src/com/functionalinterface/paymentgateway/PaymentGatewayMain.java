package com.functionalinterface.paymentgateway;

public class PaymentGatewayMain {

    public static void main(String[] args) {

        PaymentProcessor upi = new UPIPayment();
        PaymentProcessor card = new CardPayment();

        upi.pay(1500);
        upi.refund(500);

        card.pay(2000);
        card.refund(700);
    }
}
