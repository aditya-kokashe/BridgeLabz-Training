package com.encapsulationandpolymorphism.eCommercePlatform;

public class Electronics extends Product implements Taxable{

	public Electronics(int productId, String name, double price) {
		super(productId, name, price);
	
	}

	@Override
	public double calculateTax() {
		return price*0.08; 	//8% GST
	}

	@Override
	public String getTaxDetails() {
		return "Electronics tax: 8%";
	}

	@Override
	public double calculateDiscount() {
		return price*0.10; 	//10% discount
	}

}
