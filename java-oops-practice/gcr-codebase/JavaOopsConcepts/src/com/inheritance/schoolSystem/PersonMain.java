package com.inheritance.schoolSystem;

public class PersonMain {

	public static void main(String[] args) {
		
		Person a = new Teacher("Bill", 56, "Communication");
		Person b = new Student("Gates", 25, "A");
		Person c = new Staff("Aman", 20, 12);

		a.displayRole();
		b.displayRole();
		c.displayRole();
	}

}
