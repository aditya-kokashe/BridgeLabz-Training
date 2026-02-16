package com.jdbc.transactionmanagement;

public class BankMain {

    public static void main(String[] args) {

        AccountDAO accountDAO = new AccountDAO();
        TransactionDAO txnDAO = new TransactionDAO();

        System.out.println("Before Transfer:");
        accountDAO.showAccounts();

        accountDAO.transferMoney(2001, 2002, 10000);

        System.out.println("\nAfter Transfer:");
        accountDAO.showAccounts();

        System.out.println("\nTransaction History:");
        txnDAO.showTransactions();
    }
}
