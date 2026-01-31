package com.collectors.employeesalary;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryStats {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Binod", "IT", 60000),
            new Employee("Rohit", "HR", 45000),
            new Employee("Sneha", "IT", 75000),
            new Employee("Priya", "Finance", 70000),
            new Employee("Aman", "HR", 50000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                         .collect(Collectors.groupingBy(
                                 Employee::getDepartment,
                                 Collectors.averagingDouble(Employee::getSalary)
                         ));

        System.out.println(avgSalaryByDept);
    }
}
