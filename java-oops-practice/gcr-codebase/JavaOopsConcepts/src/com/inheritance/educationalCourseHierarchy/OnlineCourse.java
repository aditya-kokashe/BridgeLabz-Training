package com.inheritance.educationalCourseHierarchy;

public class OnlineCourse extends Course{

	String platform;
	String isRecorded;
	public OnlineCourse(String courseName, int duration, String platform, String isRecorded) {
		super(courseName, duration);
		this.isRecorded = isRecorded;
		this.platform = platform;
	}

}
