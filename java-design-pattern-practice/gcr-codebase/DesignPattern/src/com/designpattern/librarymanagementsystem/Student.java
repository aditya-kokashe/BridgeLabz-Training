package com.designpattern.librarymanagementsystem;

public class Student implements User{

	@Override
	public void getRole() {
		System.out.println("Student : limited borrowing");
	}
	
}
