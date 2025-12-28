package com.constructor.levelone;

public class EmployeeMain {

	public static void main(String[] args) {
		
		//Subclass Object
		Manager m1 = new Manager(123, "Science",1000.0 );
		m1.displayDetails();
		
		//get updated salary
		System.out.println();
		m1.setSalary(12000.0);
		System.out.println("Updated Salary: "+ m1.getSalary());
	}

}
