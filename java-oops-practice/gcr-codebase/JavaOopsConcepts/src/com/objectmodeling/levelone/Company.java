package com.objectmodeling.levelone;

import java.util.ArrayList;
public class Company {

	//Attributes
	String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    //Constructor
    public Company(String companyName){
        this.companyName = companyName;
    }

    //Method to add department
    public void addDepartment(Department department) {
        departments.add(department);
    }

    //Method to show details
    public void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        
        for (Department dept : departments) {
            System.out.println("Department: " + dept.departmentName);
            
            for (Employee emp : dept.employees){
                System.out.println("Employee: " + emp.employeeName);
            }
        }
    }
}
