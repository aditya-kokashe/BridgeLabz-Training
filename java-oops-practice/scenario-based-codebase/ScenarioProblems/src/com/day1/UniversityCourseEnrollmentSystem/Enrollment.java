package com.day1.UniversityCourseEnrollmentSystem;

public class Enrollment {

	
	Student student;
    Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void showDetails() {
        System.out.println(student.name + "\nEnrolled in " + course.getCourseName());
    }
	
}
