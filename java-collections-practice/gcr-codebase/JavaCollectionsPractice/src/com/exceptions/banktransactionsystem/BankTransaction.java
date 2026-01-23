package com.exceptions.banktransactionsystem;

import java.util.Scanner;

public class BankTransaction {
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     BankAccount account = new BankAccount(5000);
	
	     try {
	         System.out.print("Enter withdrawal amount: ");
	         double amount = sc.nextDouble();
	
	         account.withdraw(amount);
	     } catch (InsufficientBalanceException e) {
	         System.out.println(e.getMessage());
	
	     } catch (IllegalArgumentException e) {
	         System.out.println(e.getMessage());
	     }

	     sc.close();
	 }
}
