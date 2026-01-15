package com.day9.PayXpress;

import java.util.*;

public class PayXpressMain {

    public static void main(String[] args) {

        List<Bill> bills = new ArrayList<>();

        bills.add(new ElectricityBill(1200, "15-Feb-2026"));
        bills.add(new WaterBill(450, "12-Feb-2026"));
        bills.add(new InternetBill(999, "10-Feb-2026"));

        System.out.println("Sending Reminders");
        for (Bill b : bills) {
            b.sendReminder();          
        }

        System.out.println("\nPaying All Bills");
        for (Bill b : bills) {
            b.pay();                   
        }
    }
}
