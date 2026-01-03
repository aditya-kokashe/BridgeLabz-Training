package com.day2.CabbyGo;

public class Sedan extends Vehicle implements IRideService {

	public Sedan(int vehicleNumber, int capacity, String type, double baseFare, int rate, String location) {
		super(vehicleNumber, 5, "Sedan",200,20, location);
	}
	
	@Override
	public double calculateFare(double distance) {
		return baseFare + distance * rate;
	}

	@Override
	public String bookRide() {
		return "Your Sedan ride is booked";
		
	}

	@Override
	public String endRide() {
		return "Your Sedan ride is ended.";
		
	}

}
