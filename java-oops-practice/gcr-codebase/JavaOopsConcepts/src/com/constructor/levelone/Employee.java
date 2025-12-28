package com.constructor.levelone;

public class Employee {
	
	//Attributes
	public int employeeID;
	protected String department;
	private double salary;
	
	//Constructor
	public Employee(int employeeID, String department, double salary) {
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;

	}
	
	//Update method
	public void setSalary(double newSalary) {
		this.salary = newSalary;
	}
	
	public double getSalary() {
		return salary;
	}

}
