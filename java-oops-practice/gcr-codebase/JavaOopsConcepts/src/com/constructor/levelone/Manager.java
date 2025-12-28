package com.constructor.levelone;

public class Manager extends Employee{

	public Manager(int employeeID , String department, double salary) {
		super (employeeID, department, salary);
	}

	//Display the details
	public void displayDetails() {
		System.out.println("Employee ID: "+ employeeID);
		System.out.println("Department: "+ department);
		System.out.println("Salary: "+ getSalary());
	}
	
}

