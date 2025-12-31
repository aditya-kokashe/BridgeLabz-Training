package com.inheritance.bankAccountTypes;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount a = new SavingsAccount(56642816, 10000, 10);
		BankAccount b = new CheckingAccount(56869547, 20525, 10000);
		BankAccount c = new FixedDepositAccount(6989550, 201546);

		a.displayAccountType();
		b.displayAccountType();
		c.displayAccountType();
		
	}

}
