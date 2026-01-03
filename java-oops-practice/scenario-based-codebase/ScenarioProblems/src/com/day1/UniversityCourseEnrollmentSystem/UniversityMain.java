package com.day1.UniversityCourseEnrollmentSystem;

public class UniversityMain {
	public static void main(String[] args) {

		Course java = new Course("C101", "Java Programming");

        Student s1 = new Undergraduate(1, "Aditya");
        Student s2 = new Postgraduate(2, "Pankaj");

        Enrollment e1 = new Enrollment(s1, java);
        Enrollment e2 = new Enrollment(s2, java);

        Faculty f = new Faculty("Dr. Sharma");

        f.gradeStudent((Graded)s1, 82);
        f.gradeStudent((Graded)s2, 45);

        e1.showDetails();
        s1.display();
        System.out.println("GPA: " + s1.getGPA());

        System.out.println();
        e2.showDetails();
        s2.display();
        System.out.println("GPA: " + s2.getGPA());
		
	}

}
