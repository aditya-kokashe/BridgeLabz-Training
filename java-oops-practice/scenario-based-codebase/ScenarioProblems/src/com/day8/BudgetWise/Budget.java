package com.day8.BudgetWise;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected double expenses;

    public Budget(double income, double limit) {
        this.income = income;
        this.limit = limit;
        this.expenses = 0;
    }

    protected void addExpense(double amount) {
        expenses += amount; // encapsulated
    }

    public double netSavings() {
        return income - expenses; // operator usage
    }
}