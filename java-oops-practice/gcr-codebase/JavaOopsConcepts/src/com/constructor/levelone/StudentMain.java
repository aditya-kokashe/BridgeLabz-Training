package com.constructor.levelone;

public class StudentMain {

	public static void main(String[] args) {

		//Student object
		Student s1 = new Student(10 , "Abuzar", 8.4);
		s1.studentsDetails();
		
		//Student updated CGPA
		s1.updateCgpa(9.0);
		System.out.println("Updated CGPA: "+ s1.getCgpa());
		System.out.println();		
		
		//PostgraduateStudent object
		PostgraduateStudent p1 = new PostgraduateStudent(120, "Ravindra", 9.1, "Data science");
		p1.diaplayPGStudent();
			
		//PostgraduateStudent updated CGPA
		p1.updateCgpa(8.9);
		System.out.println("Updated CGPA: "+ p1.getCgpa());
	}

}
