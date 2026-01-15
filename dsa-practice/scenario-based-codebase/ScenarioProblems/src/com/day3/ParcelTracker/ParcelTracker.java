package com.day3.ParcelTracker;

public class ParcelTracker {
	
	CourierNode head;
	
	public void defaultChain() {
		CourierNode first = new CourierNode("Packed"); 
		CourierNode second = new CourierNode("Shipped"); 
		CourierNode third = new CourierNode("In Transit"); 
		CourierNode last = new CourierNode("Delivered"); 
		
		head = first;
		first.nextStage = second;
		second.nextStage = third;
		third.nextStage = last;
		
	}
	
	public void customAdd(String existingStage , String newStage) {
		CourierNode n = new CourierNode(newStage);
		if (head == null) {
			head = n;
			return;
		}
		else {
			CourierNode temp = head;
			while(temp != null) {
				if(existingStage.equals(temp.status)) {
					CourierNode current = temp.nextStage;
					temp.nextStage = n;
					n.nextStage = current;
					return;
				}
				temp = temp.nextStage;
			}
			
		}
	}
	
	public void checkpoint() {
		CourierNode temp = head;
		
		while(temp != null) {
			if(temp.status.equals("Delivered")) {
				System.out.println("\nParcel is successfully delivered!");
				return;
			}
			temp = temp.nextStage;
		}
		System.out.print("\nParcel is missing\n");
	}
	
	public void chainBreak(String status) {
		CourierNode temp = head;
		while(temp != null) {
			if(temp.status.equals(status)) {
				temp.nextStage = null;
				return;
		
			}
			temp = temp.nextStage;
		}
		
	}
	
	public void display() {
		CourierNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.status);
			if(temp.nextStage != null) {
				System.out.print(" -> ");
			}
			temp = temp.nextStage;
		}
		System.out.println();
		
	}
	
}
