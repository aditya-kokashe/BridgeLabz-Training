package com.functionalinterface.digitalpayment;

public class PaymentMain {

    public static void main(String[] args) {

        PaymentMethod upi = new UPIPayment();
        PaymentMethod card = new CreditCardPayment();
        PaymentMethod wallet = new WalletPayment();

        upi.pay(1500);
        card.pay(1000);
        wallet.pay(500);
    }
}
