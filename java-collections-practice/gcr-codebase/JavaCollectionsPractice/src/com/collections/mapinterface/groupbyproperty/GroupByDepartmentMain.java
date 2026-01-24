package com.collections.mapinterface.groupbyproperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GroupByDepartmentMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", Department.HR));
        employees.add(new Employee("Bob", Department.IT));
        employees.add(new Employee("Carol", Department.HR));

        Map<Department, List<Employee>> grouped =
                EmployeeGrouper.groupByDepartment(employees);

        System.out.println("Employees grouped by department:");
        for (Map.Entry<Department, List<Employee>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
