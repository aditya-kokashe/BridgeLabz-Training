package com.encapsulationandpolymorphism.vehicleRentalSystem;

public class Car extends Vehicle implements Insurable{

	public Car(String number, double rate, String policy) {
		super(number, "Car", rate, policy);
	}
	
	@Override
	public double calculateRentalCost(int days) {
		return rentalRate * days;
	}
	
	@Override
    public double calculateInsurance() {
        return rentalRate * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: 15% of rental rate";
    }
}
