package com.encapsulationandpolymorphism.eCommercePlatform;

public class Groceries extends Product{

	public Groceries(int productId, String name, double price) {
		super(productId, name, price);
	}

	@Override
	public double calculateDiscount() {
		return price* 0.05;	//5% discount
	}

	@Override
	public double calculateTax() {
		return 0;
	}

	@Override
	public String getTaxDetails() {
		return null;
	}

}
