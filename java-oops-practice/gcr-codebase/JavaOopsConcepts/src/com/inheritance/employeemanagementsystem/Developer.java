package com.inheritance.employeemanagementsystem;

public class Developer extends Employee{

	String programmingLanguage;
	
	public Developer(String name, int id, double salary , String programmingLanguage) {
		
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	void displayDetails() {
		System.out.println("\nName: "+ name+ "\nId: "+ id+"\nSalary: "+ salary+"\nprogramming Lang: "+ programmingLanguage);
	}
}
