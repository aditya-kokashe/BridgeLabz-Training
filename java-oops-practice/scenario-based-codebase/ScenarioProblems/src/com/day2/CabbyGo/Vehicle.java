package com.day2.CabbyGo;

public class Vehicle {

	protected int vehicleNumber;
	protected int capacity;
	protected String type;
	protected double baseFare;
	protected int rate;
	protected String location;
	
	public Vehicle(int vehicleNumber, int capacity, String type, double baseFare, int rate, String location) {
		this.capacity = capacity;
		this.type = type;
		this.location = location;
		this.rate = rate;
		this.baseFare = baseFare;
		this.vehicleNumber= vehicleNumber;
	}
	
	public double calculateFare(double distance) {
		return distance;
	}
	
	public void display() {
		System.out.println("\nVehicle Number: "+ vehicleNumber+ "\nCapacity: "+ capacity+"\nType: "+ type+"\nBase Fare: "+ baseFare+"\nLocation: "+ location);
	}

}
