package com.encapsulationandpolymorphism.vehicleRentalSystem;

public abstract class Vehicle{

	private String vehicleNumber;
	protected String type;
	protected double rentalRate;
	private String insurancePolicyNumber; //encapsulated
	
	public Vehicle(String vehicleNumber, String type, double rate,String policyNumber) {
		this.rentalRate = rate;
		this.type = type;
		this.vehicleNumber = vehicleNumber;
		this.insurancePolicyNumber = policyNumber;
	}
	
	public abstract double calculateRentalCost(int days);
	
	//Encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate > 0) {
            this.rentalRate = rentalRate;
        }
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
	
	public void display(){
		System.out.println("\nVehicle Number: "+ vehicleNumber+"\nType: "+type+"\nRental Rate: "+rentalRate);
	}
	
}
