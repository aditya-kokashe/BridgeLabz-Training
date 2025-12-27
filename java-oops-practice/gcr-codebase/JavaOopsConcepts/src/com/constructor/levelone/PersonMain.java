package com.constructor.levelone;

public class PersonMain {

	public static void main(String[] args) {
		
		//Default constructor
		Person p1 = new Person();
		System.out.println("Person 1: ");
		p1.displayDetails();

		//Copy constructor
		Person p2 = new Person(p1);
		System.out.println("Person 2: ");
		p2.displayDetails();
	}

}
