package com.inheritance.animalhierarchy;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal d = new Dog("Tommy", 1);
		Animal c = new Cat("Mansi", 2);
		Animal b = new Bird("Birdie", 1);
		
		d.makeSound();
		c.makeSound();
		b.makeSound();
	}

}
