package com.day5.LoanBuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(int term, Applicant applicant) {
        super("Auto Loan", term, 10.0, applicant);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = basicEligibilityCheck(650);
        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        // Auto loans have slightly higher EMI due to risk
        return ((P * R * Math.pow(1 + R, N)) /
                (Math.pow(1 + R, N) - 1)) * 1.02;
    }
}
