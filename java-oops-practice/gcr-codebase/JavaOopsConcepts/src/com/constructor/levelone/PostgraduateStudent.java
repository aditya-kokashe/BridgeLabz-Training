package com.constructor.levelone;

public class PostgraduateStudent extends Student{
	
	//Attributes
	String specialization;

	//Constructor
	public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
		super(rollNumber, name, cgpa);
		this.specialization = specialization;
	}
	
	void diaplayPGStudent(){
		//We can directly access name because it is protected
		System.out.println("Roll Number: "+ rollNumber);
		System.out.println("Postgraduate Student: "+ name);
		System.out.println("Specialization: " + specialization);
		System.out.println("CGPA: "+ getCgpa());
	}
	

}
