package com.day1.UniversityCourseEnrollmentSystem;

public class Postgraduate extends Student implements Graded{

	public Postgraduate(int studentId, String name) {
        super(studentId, name);
    }

    @Override
    public void assignGrade(double marks) {
        double gpa = (marks >= 50) ? 4.0 : 0.0;
        setGPA(gpa);
    }

    @Override
    public void display() {
        System.out.println("Postgraduate Student");
    }
}
