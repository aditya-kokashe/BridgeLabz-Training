package com.objectmodeling.levelone;

import java.util.ArrayList;
public class Department {

	String departmentName;
    ArrayList<Employee> employees = new ArrayList<>();

    //Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    //Method add employee
    void addEmployee(String name) {
        employees.add(new Employee(name));
    }

}
