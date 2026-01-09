package com.day5.LoanBuddy;

public class LoanBuddyMain {

    public static void main(String[] args) {

        Applicant applicant = new Applicant(
                "Ayush", 720, 75000, 1500000
        );

        applicant.displayApplicant();

        LoanApplication homeLoan =
                new HomeLoan(240, applicant);

        if (homeLoan.approveLoan()) {
            System.out.println("Home Loan Approved");
            System.out.println("Monthly EMI: INR " +
                    Math.round(homeLoan.calculateEMI()));
        } else {
            System.out.println("Home Loan Rejected");
        }

        System.out.println();

        LoanApplication autoLoan =
                new AutoLoan(60, applicant);

        if (autoLoan.approveLoan()) {
            System.out.println("Auto Loan Approved");
            System.out.println("Monthly EMI: INR " +
                    Math.round(autoLoan.calculateEMI()));
        } else {
            System.out.println("Auto Loan Rejected");
        }
    }
}
