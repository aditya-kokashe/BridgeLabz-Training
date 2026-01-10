package com.day7.SkillForge;

public class SkillForgeMain {

	public static void main(String[] args) {

        String[] mods = {"Intro", "OOPS", "Project"};

        Course c1 = new BeginnerCourse("Java Basics", "Rahul", mods);
        Course c2 = new AdvancedCourse("System Design", "Ankit", mods);

        Student s1 = new Student("Aman", "aman@gmail.com", c1);
        Student s2 = new Student("Neha", "neha@gmail.com", c2);

        
        //Aman modules
        s1.displayInfo();
        s1.completeModule(); 
        s1.completeModule(); 
        //s1.completeModule();      //incomplete
        //display certificates
        s1.generateCertificate();   // Basic Certificate
        
        //Neha modules
        s2.displayInfo();
        s2.completeModule(); 
        s2.completeModule(); 
        s2.completeModule();

        //display certificates
        s2.generateCertificate();   // Gold Certificate
    }
}
