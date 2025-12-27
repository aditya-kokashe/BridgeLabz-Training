package com.constructor.levelone;

public class Person {
	double height;
	double weight;
	String hair;
	
	public Person() {
		height = 120;
		weight = 50;
		hair = "white";
	}
	
	public Person(Person previousPerson) {
		this.height = previousPerson.height;
		this.weight = previousPerson.weight;
		this.hair = previousPerson.hair;
	}
	
	void displayDetails() {
		System.out.println(height);
		System.out.println(weight);
		System.out.println(hair);
	}

}
