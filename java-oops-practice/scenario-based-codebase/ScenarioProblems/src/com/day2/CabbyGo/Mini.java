package com.day2.CabbyGo;

public class Mini extends Vehicle implements IRideService {

	public Mini(int vehicleNumber, int capacity, String type, double baseFare, int rate, String location) {
		super(vehicleNumber, 4, "Mini", 100, 20, location);
	}
	
	@Override
	public double calculateFare(double distance) {
		return baseFare + distance * rate;
	}

	@Override
	public String bookRide() {
		return "Your Mini ride is booked";
	}

	@Override
	public String endRide() {
		return "\nYour Mini ride is ended.";
	}

}
