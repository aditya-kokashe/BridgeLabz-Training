package com.inheritance.schoolSystem;

public class Student extends Person{

	String grade;
	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}
	
	public void displayRole() {
		System.out.println("\nName: "+name+"\nAge: "+ age+ "\nGrade: "+grade);
	}
}	