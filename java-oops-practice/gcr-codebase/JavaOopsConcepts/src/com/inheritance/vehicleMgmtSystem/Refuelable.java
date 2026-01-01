package com.inheritance.vehicleMgmtSystem;

public interface Refuelable {
	public default void refuel() {
		System.out.println("\nThis is a refuelable vehicle.");
	}
}
