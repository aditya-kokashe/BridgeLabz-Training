package com.constructor.levelone;

public class BankAccountMain {

	public static void main(String[] args) {

		SavingsAccount b1 = new SavingsAccount(123123, "Abacus", 123456.0);
		b1.displayDetails();
		
		System.out.println();
		
		b1.setBalance(120000.0);
		System.out.println("Updated Balance: "+b1.getBalance());

	}

}
