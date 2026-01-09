package com.day7.FoodLoop;

public class FoodItem {

	protected String name;
	protected String category;
	private double price;
	private boolean availability;
	
	public FoodItem(String name, String category, double price, boolean availability) {
		this.availability= availability;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return availability;
	}
	
	public void getDetails() {
		System.out.println("\n Name: "+ name+"\n Category: "+ category+"\n Price: "+ price);
	}
	
}
