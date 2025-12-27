package com.constructor.levelone;

public class Course {
	
	//Instance variables
	String courseName;
	int duration;
	double fee;
	
	//Class variables
	static String instituteName = "National Institute";
	
	//Parameterized constructor
	public Course(String courseName, int duration, double fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	//Instance method
	void displayCourseDetails() {
		System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
	}
	
	//Class method
	static void updateInstituteName(String newName) {
		instituteName = newName;
	}

}
