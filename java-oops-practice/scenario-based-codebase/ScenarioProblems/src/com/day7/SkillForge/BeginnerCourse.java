package com.day7.SkillForge;

public class BeginnerCourse extends Course{

	public BeginnerCourse(String title, String instructor, String[] m) {
		super(title, instructor, m);
	}

	@Override
	public String certificateFormat() {
		// TODO Auto-generated method stub
		return "Basic completion certificate for : "+ getTitle();
	}

}
