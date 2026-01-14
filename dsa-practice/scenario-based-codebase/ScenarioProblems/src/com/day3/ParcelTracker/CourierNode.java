package com.day3.ParcelTracker;

public class CourierNode {

	String status;
	CourierNode nextStage;
	
	public CourierNode(String status) {
		this.status = status;
		this.nextStage = null;
	}
	
	@Override
	public String toString() {
		return status;
	}
}
