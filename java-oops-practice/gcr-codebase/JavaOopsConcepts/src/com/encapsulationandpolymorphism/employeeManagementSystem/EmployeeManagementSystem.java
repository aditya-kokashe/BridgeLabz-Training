package com.encapsulationandpolymorphism.employeeManagementSystem;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Aditya", 45000);
        Employee e2 = new PartTimeEmployee(102, "Riya", 80);

        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        Employee[] employees = {e1, e2};

        for (Employee emp : employees) {
            emp.displayDetails();  
        }
    }
}
