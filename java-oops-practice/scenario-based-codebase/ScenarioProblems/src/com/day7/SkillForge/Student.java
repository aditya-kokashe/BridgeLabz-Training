package com.day7.SkillForge;

public class Student extends User implements ICertifiable{

	private Course enrolledCourse;
	private int completedModules;
	
	public Student(String name, String email, Course enrolledCourse) {
		super(name, email);
		this.enrolledCourse = enrolledCourse;
	}

	@Override
	public void displayInfo() {
		System.out.println("\nStudent Name: "+ name+ "\nStudent Email: "+ email);		
	}

	public void completeModule() {
		completedModules++;
	}
	
	@Override
	public void generateCertificate() {
		double progress = (completedModules * 100) / enrolledCourse.modules.size();
		if(progress == 100) {
			System.out.println("+-----------------------------------------------+");
			System.out.println(" Certificate issued in: "+ enrolledCourse);
			System.out.println("+-----------------------------------------------+");
		}else {
			System.out.println("+-----------------------------------------------+");
			System.out.println(" complete all modules to get certificate.");
			System.out.println("+-----------------------------------------------+");
		}
		
	}

}
