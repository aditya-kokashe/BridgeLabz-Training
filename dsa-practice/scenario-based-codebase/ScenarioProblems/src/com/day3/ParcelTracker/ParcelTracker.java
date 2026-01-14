package com.day3.ParcelTracker;

public class ParcelTracker {
	
	CourierNode head;
	boolean isLost = false;
	
	public void add(String status) {
		CourierNode n = new CourierNode(status);
		if (head == null) {
			head = n;
			return;
		}
		else {
			CourierNode current = head;
			while(current.nextStage != null) {
				current = current.nextStage;
			}
			current.nextStage = n;
		}
	}
	
	public void checkpoint(String status) {
		if(!isLost) {
			System.out.println("\nParcel "+status+", checking complete!");
		}
	}
	
	public void display() {
		CourierNode temp = head;
		if(isLost) {
			System.out.println("Parcel is missing.");
		}else {
			while(temp != null) {
				System.out.print(temp+ " -> ");
				temp = temp.nextStage;
			}
			System.out.print("Null");
			System.out.println();
		}
	}
	
}
