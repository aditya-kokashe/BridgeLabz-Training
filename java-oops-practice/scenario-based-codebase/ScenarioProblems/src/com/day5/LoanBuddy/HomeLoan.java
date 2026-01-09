package com.day5.LoanBuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(int term, Applicant applicant) {
        super("Home Loan", term, 8.5, applicant);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = basicEligibilityCheck(700);
        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}

