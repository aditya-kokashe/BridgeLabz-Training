package com.inheritance.educationalCourseHierarchy;

public class PaidOnlineCourse extends OnlineCourse{

	int fee;
	int discount;
	public PaidOnlineCourse(String courseName, int duration, String platform, String isRecorded, int fee, int discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	
	public void display() {
		System.out.println("Course Name: "+courseName+"\nDuration: "+duration+" week \nPlatform: "+platform+"\nRecorded: "+isRecorded+"\nFees: "+fee+"\nDiscount: "+ discount);
	}

}
