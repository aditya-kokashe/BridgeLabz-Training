package com.day1.UniversityCourseEnrollmentSystem;

public class Undergraduate extends Student implements Graded{

	public Undergraduate(int stuId, String name) {
		super(stuId, name);
	}
	
	@Override
    public void assignGrade(double marks) {
        double gpa;
        if(marks >= 90) gpa = 4.0;
        else if(marks >= 75) gpa = 3.0;
        else if(marks >= 60) gpa = 2.0;
        else gpa = 1.0;

        setGPA(gpa);
    }

	@Override
    public void display() {
        System.out.println("Undergraduate Student");
    }

}
