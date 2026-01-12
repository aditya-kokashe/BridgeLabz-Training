package com.day8.BudgetWise;

public class BudgetWiseMain {

    public static void main(String[] args) {

        Budget budget = new MonthlyBudget(50000, 30000);
        budget.addExpense(12000);
        budget.addExpense(15000);

        budget.generateReport();
        budget.detectOverspend();
    }
}