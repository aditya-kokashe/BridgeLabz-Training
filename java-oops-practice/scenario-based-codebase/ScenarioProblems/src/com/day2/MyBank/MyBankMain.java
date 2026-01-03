package com.day2.MyBank;

public class MyBankMain {

	public static void main(String[] args) {

		Account a = new CurrentAccount(888091378, "Anil Kapoor", 10000, 10);
        Account b = new SavingsAccount(663265786, "Sarana Khan", 25060, 20);

        Account[] accounts = { a, b };

        for (Account acc : accounts) {
            acc.display();
            System.out.println("Interest: " + acc.calculateInterest());

            if (acc instanceof ITransaction) {
                ITransaction t = (ITransaction) acc;
                t.deposit(1000);
                System.out.println("Balance After Deposit: " + t.checkBalance());
            }

            System.out.println("----------------------------------");
        }
	}
}
