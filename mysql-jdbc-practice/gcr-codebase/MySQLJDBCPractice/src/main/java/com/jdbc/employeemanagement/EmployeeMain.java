package com.jdbc.employeemanagement;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeDAO dao = new EmployeeDAO();

        dao.insertEmployee(new Employee(101, "Abhinav Shakya", 12000));
        dao.insertEmployee(new Employee(102, "Mansi Pathak", 10000));
        dao.insertEmployee(new Employee(103, "Manasvi Suryavanshi", 13000));
        dao.insertEmployee(new Employee(104, "Raman Jothe", 14000));
        dao.insertEmployee(new Employee(105, "Vikash Dubey", 15000));

        System.out.println("\nAll Employees:");
        dao.getAllEmployees();

        dao.updateSalary(103, 15000);
        dao.deleteEmployee(105);

        System.out.println("\nAfter Update & Delete:");
        dao.getAllEmployees();

        System.out.println("\nSearch Result:");
        dao.searchByName("Mansi Pathak");
    }
}
