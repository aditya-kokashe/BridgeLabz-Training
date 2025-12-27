package com.constructor.levelone;

public class CourseMain {

	public static void main(String[] args) {
		
		//Create objects
		Course c1 = new Course("Java full stack", 6 , 45000);
		Course c2 = new Course("Python programming" , 5, 50000);
		
		//Instance method call
		c1.displayCourseDetails();
		System.out.println();
		c2.displayCourseDetails();
		System.out.println();
		
		
		//Class method call
		Course.updateInstituteName("Prime Technology");
		
		c1.displayCourseDetails();
        System.out.println();
	}

}
