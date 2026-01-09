package com.day5.LoanBuddy;

public abstract class LoanApplication implements IApprovable {

    protected String loanType;
    protected int term;                // in months
    protected double interestRate;     // annual
    protected Applicant applicant;

    private boolean approved;          // internal status only

    public LoanApplication(String loanType, int term,
                           double interestRate, Applicant applicant) {
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
        this.applicant = applicant;
        this.approved = false;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    protected boolean basicEligibilityCheck(int minCreditScore) {
        return applicant.getCreditScore() >= minCreditScore &&
               applicant.getIncome() >= (applicant.getLoanAmount() / 12);
    }
}
