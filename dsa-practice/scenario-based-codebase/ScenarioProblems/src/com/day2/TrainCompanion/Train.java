package com.day2.TrainCompanion;

public class Train {
	Compartment head;
	Compartment tail;
	
	//Add compartment at end
	public void  addCompartment(String service) {
		Compartment newComp = new Compartment(service);
		if(head == null) {
			head = tail = newComp;
			return;
		}
		else {
			tail.next = newComp;
			newComp.prev = tail;
			tail = newComp;
		}
	}
	
	//Remove a compartment
	public void removeCompartment(String service) {
		Compartment temp = head;
		while(temp != null) {
			if(temp.service.equals(service)) {
				if(temp.prev != null) {
					temp.prev.next = temp.next;
				}
				else {
					head = temp.next;
				}
				if(temp.next != null) {
					temp.next.prev = temp.prev;
				}
				else {
					tail = temp.prev;
				}
				System.out.println("\nRemoved : "+ service);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Compartment not found.");
	}
	
	//Traverse forward
	public void traverseForward() {
		Compartment temp = head;
		System.out.println("\nForward: ");
		while(temp != null) {
			System.out.print(temp.service + " -> ");
			temp = temp.next;
		}	
		System.out.println("End");
	}
	
	//Traverse forward
	public void traverseBackward() {
		Compartment temp = tail;
		System.out.println("\nBackward: ");
		while(temp != null) {
			System.out.print(temp.service + " -> ");
			temp = temp.prev;
		}	
		System.out.println("Start");
	}
	
	//Show adjacent compartments
	public void showAdjacent(String service) {
		Compartment temp = head;
		while(temp != null) {
			if(temp.service.equals(service)) {
				if(temp.prev != null) {
					System.out.print("\nPrevious : "+ temp.prev.service);
				}
				System.out.print(" | Current: "+ temp.service);
				if(temp.next != null) {
					System.out.print(" | Next : " + temp.next.service);
				}
				System.out.println();
				return;
			}
			temp = temp.next;
		}
		System.out.println("Compartment not found.");
	}
	
	
}
