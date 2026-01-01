package com.encapsulationandpolymorphism.employeeManagementSystem;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double ratePerHour = 200;

    public PartTimeEmployee(int id, String name, int hoursWorked) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}
