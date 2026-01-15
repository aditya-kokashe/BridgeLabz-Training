package com.day3.ParcelTracker;

public class ParcelTrackerMain {

	public static void main(String[] args) {
		
		ParcelTracker p = new ParcelTracker();
		p.defaultChain();
		p.customAdd("Shipped", "Check");
//		p.chainBreak("In Transit");
		p.display();
		p.checkpoint();
		
	}

}
