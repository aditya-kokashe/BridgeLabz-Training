package com.day1.UniversityCourseEnrollmentSystem;

public abstract class Student {

	protected int stuId;
	protected String name;
	private double gpa;
	
	public Student(int stuId, String name) {
		this.name = name;
		this.stuId = stuId;
	}
	protected void setGPA(double gpa) {
		this.gpa = gpa;
	}
	public double getGPA() {
		return gpa;
	}
	
	public abstract void display();
}
