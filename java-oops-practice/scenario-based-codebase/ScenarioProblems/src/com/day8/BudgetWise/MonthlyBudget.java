package com.day8.BudgetWise;

public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit) {
        super(income, limit);
    }

    public void generateReport() {
        System.out.println("Monthly Report | Savings: " + netSavings());
    }

    public void detectOverspend() {
        if (expenses > limit)
            System.out.println("Monthly overspending detected!");
    }
}