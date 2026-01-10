package com.day7.SkillForge;

public class Instructor extends User{

	public Instructor(String name, String email) {
		super(name, email);
	}

	@Override
	public void displayInfo() {
		System.out.println("\nInstructor Name: "+ name+ "\nInstructor Email: "+ email);		
	}

}
