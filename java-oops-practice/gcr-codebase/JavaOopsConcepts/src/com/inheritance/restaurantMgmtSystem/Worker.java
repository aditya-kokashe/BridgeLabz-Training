package com.inheritance.restaurantMgmtSystem;

public interface Worker {
	public default void performDuties() {
		
		System.out.println("\nThis worker works for 10 hrs");
		
	}
}
