package com.constructor.levelone;

public class Student {
	
	//Attributes
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	//Constructor
	public Student(int rollNumber, String name, double cgpa ) {
		this.rollNumber = rollNumber;
		this.name= name;
		this.cgpa = cgpa;
	}
	
	//Public method to modify private CGPA
    public void updateCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    //Public method to access CGPA
    public double getCgpa() {
        return cgpa;
    }
	
	public void studentsDetails() {
		System.out.println("Roll Number: "+ rollNumber);
		System.out.println("Name: " + name);
		System.out.println("CGPA: " + cgpa);
	}

}
