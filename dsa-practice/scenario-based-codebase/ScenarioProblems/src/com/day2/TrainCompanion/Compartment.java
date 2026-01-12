package com.day2.TrainCompanion;

public class Compartment {
	String service;
	Compartment prev;
	Compartment next;
	
	public Compartment(String service) {
		this.service = service;
	}
}
