package com.day2.CabbyGo;

public class SUV extends Vehicle implements IRideService{

	public SUV(int vehicleNumber, int capacity, String type, double basefare, int rate, String location) {
		super(vehicleNumber, 7, "SUV", 150,40, location );
	}

	@Override
	public double calculateFare(double distance) {
		return baseFare + distance * rate;
	}
	
	@Override
	public String bookRide() {
		return "Your SUV ride is booked";
		
	}

	@Override
	public String endRide() {
		return "Your SUV ride is ended.";
		
	}

}
