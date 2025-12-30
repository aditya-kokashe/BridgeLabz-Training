package com.objectmodeling.levelone;

public class BankMain {

	public static void main(String[] args) {

		//objects for bank and customer
		Bank bank = new Bank("Central Bank of India");
        Customer customer = new Customer("Andrew Tate", 50000);

        //display results
        bank.openAccount(customer);
        customer.viewBalance();
	}

}
