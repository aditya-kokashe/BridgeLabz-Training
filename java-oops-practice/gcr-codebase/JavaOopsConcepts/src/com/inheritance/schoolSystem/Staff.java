package com.inheritance.schoolSystem;

public class Staff extends Person{

	int members;
	public Staff(String name, int age, int members) {
		super(name, age);
		this.members = members;
	}
	
	public void displayRole() {
		System.out.println("\nName: "+name+"\nAge: "+ age+ "\nMembers: "+members);
	}
}