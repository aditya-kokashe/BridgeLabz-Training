package com.encapsulationandpolymorphism.vehicleRentalSystem;

public class Truck extends Vehicle implements Insurable{

	public Truck(String number,double rate, String policy) {
		super(number, "Truck",rate, policy);
	}
	
	@Override
	public double calculateRentalCost(int days) {
		return rentalRate * days * 1.5;
	}
	
	@Override
    public double calculateInsurance() {
        return rentalRate * 0.20;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: 20% of rental rate";
    }
}