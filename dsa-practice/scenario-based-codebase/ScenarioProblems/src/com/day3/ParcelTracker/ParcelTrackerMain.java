package com.day3.ParcelTracker;

public class ParcelTrackerMain {

	public static void main(String[] args) {
		
		ParcelTracker p = new ParcelTracker();
		
		p.add("Packed");
		p.add("Shipped");
		p.add("In Transit");
		p.add("Delivered");

		p.display();
		p.checkpoint("Shipped");
		p.checkpoint("Delivered");
	}

}
