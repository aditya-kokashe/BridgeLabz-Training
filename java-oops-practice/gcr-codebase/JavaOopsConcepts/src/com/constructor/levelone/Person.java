package com.constructor.levelone;

public class Person {
	
	//Attributes
	double height;
	double weight;
	String hair;
	
	//Default constructor
	public Person() {
		height = 120;
		weight = 50;
		hair = "white";
	}
	
	//Copy constructor
	public Person(Person previousPerson) {
		this.height = previousPerson.height;
		this.weight = previousPerson.weight;
		this.hair = previousPerson.hair;
	}
	
	void displayDetails() {

		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
		System.out.println("hair color: "+hair);
		System.out.println("----------------------");
	}

}
