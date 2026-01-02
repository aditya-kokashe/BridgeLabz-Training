package com.encapsulationandpolymorphism.bankingSystem;

public class SavingsAccount extends BankAccount implements Loanable{

	public SavingsAccount(long accountNumber , String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	@Override
	public double calculateInterest() {
		return balance * 0.04; 	//4% intrest
	}
	
	@Override
    public void applyForLoan() {
        System.out.println("Savings Account Loan Applied");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 3;
    }
    


}
