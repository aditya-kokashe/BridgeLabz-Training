package com.constructor.levelone;

public class CircleMain {

	public static void main(String[] args) {
		
		//Default constructor
		Circle circle1 = new Circle();
		System.out.println("Circle 1: ");
		circle1.displayCircleDetails();
		
		//parameterized constructor
		Circle circle2 = new Circle(10);
		System.out.println("Circle 2: ");
		circle2.displayCircleDetails();
	}
}
