package com.day1.VehicleRentalApplication;

public abstract class Vehicle{

	protected String vehicleNumber;
	protected String type;
	protected double baseRate;
	
	public Vehicle(String vehicleNumber, String type, double baseRate) {
		this.baseRate = baseRate;
		this.type = type;
		this.vehicleNumber = vehicleNumber;
	}
	
	//Encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public double getBaseRate() {
        return baseRate;
    }
    public void setBaseRate(double baseRate) {
        if (baseRate > 0) {
            this.baseRate = baseRate;
        }
    }
	
	
    //Concrete method
	public void display(){
		System.out.println("\nVehicle Number: "+ vehicleNumber+"\nType: "+type+"\nBase Rate: "+ baseRate);
	}
}