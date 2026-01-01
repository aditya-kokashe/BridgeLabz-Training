package com.encapsulationandpolymorphism.vehicleRentalSystem;

public class Bike extends Vehicle implements Insurable{

	public Bike(String number, double rate, String policy) {
		super(number, "Bike",rate, policy);
	}
	
	@Override
	public double calculateRentalCost(int days) {
		return rentalRate*days*0.9;	//bike discount
	}
	
	@Override
    public double calculateInsurance() {
        return rentalRate * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: 5% of rental rate";
    }
}