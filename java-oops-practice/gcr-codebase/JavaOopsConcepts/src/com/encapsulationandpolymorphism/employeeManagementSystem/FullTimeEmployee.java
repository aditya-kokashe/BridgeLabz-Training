package com.encapsulationandpolymorphism.employeeManagementSystem;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed monthly salary
    }
}
