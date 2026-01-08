package com.day6.MediStore;

public class Medicine {

	private String name ;
	private String expiryDate;
	private double price;
	private int quantity;
	
	public Medicine(String name, String expiryDate, double price, int quantity) {
		this.name = name;
		this.expiryDate = expiryDate;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public String getName() {
		return name;	
	}
	
	public String getDetails() {
		return "\nName: "+name+" \nExpiry Date: "+ expiryDate+ 
				" \nPrice: "+ price+ " \nQuantity: "+ quantity;
	}
	
	public void displayInfo() {
		System.out.println(getDetails());
	}

}
