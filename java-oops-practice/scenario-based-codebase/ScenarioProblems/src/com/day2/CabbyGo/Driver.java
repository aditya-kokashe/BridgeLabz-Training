package com.day2.CabbyGo;

public class Driver {

	protected String name;
	protected int licenseNumber;
	private int rating;
	
	public Driver(String name, int licenseNumber, int rating) {
		this.licenseNumber = licenseNumber;
		this.name = name;
		this.rating = rating;
	}
	
	public void display() {
		System.out.println("Driver Name: "+ name+"\nLicense Number: "+ licenseNumber+ "\nRating: "+ rating+" out of 10");
	}

}
