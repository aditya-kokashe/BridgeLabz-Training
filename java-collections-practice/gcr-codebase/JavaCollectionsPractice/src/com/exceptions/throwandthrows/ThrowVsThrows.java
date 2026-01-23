package com.exceptions.throwandthrows;

import java.util.Scanner;

public class ThrowVsThrows{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter years: ");
            int years = sc.nextInt();

            double interest = CalculateIntrest.calculate(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }

        sc.close();
    }
}
