package com.inheritance.restaurantMgmtSystem;

public class PersonMain {

	public static void main(String[] args) {
		
		Person a = new Chef("Moito", 1001);
		Person b = new Waiter("Mahogara", 1002);

		a.performDuties();
		b.performDuties();
	}

}
