package com.encapsulationandpolymorphism.eCommercePlatform;

public class Clothing extends Product{

	public Clothing(int productId, String name, double price) {
		super(productId, name, price);
	}

	@Override
	public double calculateTax() {
		return price*0.05; 	// 5% GST		
	}

	@Override
	public String getTaxDetails() {
		return "Clothing tax: 5%";
	}

	@Override
	public double calculateDiscount() {
		return price *0.20; 	//20 % discount
	}

}
