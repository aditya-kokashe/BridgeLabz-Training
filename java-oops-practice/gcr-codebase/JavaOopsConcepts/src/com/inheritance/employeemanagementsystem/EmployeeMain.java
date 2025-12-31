package com.inheritance.employeemanagementsystem;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee a = new Manager("Aman", 101, 10000, 0);
		Employee b = new Developer("Raj", 212, 2200, "Java");
		Employee c = new Intern("Andrew", 12, 2000, 0);

		a.displayDetails();
		b.displayDetails();
		c.displayDetails();
	}

}
