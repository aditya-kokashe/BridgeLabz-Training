package com.inheritance.employeemanagementsystem;

public class Intern extends Employee{

	int internId;
	public Intern(String name, int id, double salary , int internId) {
		super (name,id,salary);
		this.internId = internId;
	}
	void displayDetails() {
		System.out.println("\nName: "+ name+ "\nId: "+ id+"\nSalary: "+ salary+"\nIntern id: "+ internId);
	}
}
