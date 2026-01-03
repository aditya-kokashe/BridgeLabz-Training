package com.day1.UniversityCourseEnrollmentSystem;

public class Faculty {

	private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void gradeStudent(Graded student, double marks) {
        student.assignGrade(marks);   // Polymorphism
    }

}
