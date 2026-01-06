package com.day4.EduMentor;

public  class User {

	protected String name;
	protected String email;
	protected String userId;
	
	public User(String name, String email, String userId) {
		this.name = name;
		this.email = email;
		this.userId = userId;
	}
	
	public  void displayInfo() {
		System.out.println(name + " "+ email+ " "+ userId);
	};	
}
