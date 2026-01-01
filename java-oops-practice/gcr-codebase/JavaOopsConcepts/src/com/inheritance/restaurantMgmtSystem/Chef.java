package com.inheritance.restaurantMgmtSystem;

public class Chef extends Person implements Worker{

	public Chef(String name, int id) {
		super(name, id);
	}
	
	public void performDuties() {
		System.out.println("Name: "+ name+"\nId: "+ id);
	}

}
