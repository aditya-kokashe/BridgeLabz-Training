package com.day5.LoanBuddy;

public class Applicant {

    private String name;
    private int creditScore;     // encapsulated
    private double income;
    private double loanAmount;

    public Applicant(String name, int creditScore, double income, double loanAmount) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    // Only controlled access
    public int getCreditScore() {
        return creditScore;
    }

    public double getIncome() {
        return income;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void displayApplicant() {
        System.out.println(
                name + " | Credit Score: " + creditScore +
                " | Income: INR " + income +
                " | Loan Amount: INR " + loanAmount
        );
    }
}
