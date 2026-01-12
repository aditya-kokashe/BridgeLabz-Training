package com.day8.BudgetWise;

public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit) {
        super(income, limit);
    }

    public void generateReport() {
        System.out.println("Annual Report | Savings: " + netSavings());
    }

    public void detectOverspend() {
        if (expenses > limit)
            System.out.println("Annual overspending detected!");
    }
}