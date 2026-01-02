package com.encapsulationandpolymorphism.bankingSystem;

import java.util.*;

public class BankAccountMain {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(101001, "Pankaj", 50000));
        accounts.add(new CurrentAccount(202002, "Rahul", 80000));

        for (BankAccount acc : accounts) {

            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Interest: " + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                l.applyForLoan();
                System.out.println("Loan Eligibility: " + l.calculateLoanEligibility());
            }

            System.out.println();
        }
    }
}
