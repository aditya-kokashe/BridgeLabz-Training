package com.constructor.levelone;

public class Circle {
	double radius;
	
	//default constructor
	public Circle() {
		//constructor chaining - calls the other constructor
		this(1.0);
	}
	
	//parameterized constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	void displayCircleDetails () {
		System.out.println("Diameter " + radius*2);
		System.out.println("Radius: "+ radius);
	}
}
