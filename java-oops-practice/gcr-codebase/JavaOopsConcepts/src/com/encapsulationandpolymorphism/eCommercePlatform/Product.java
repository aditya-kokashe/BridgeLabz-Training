package com.encapsulationandpolymorphism.eCommercePlatform;

public abstract class Product implements Taxable{

	private int productId;
	private String name;
	protected double price;
	
	public Product(int productId, String name, double price) {
		this.name = name;
		this.price = price;
		this.productId= productId;
	}
	
	//Abstract method
	public abstract double calculateDiscount();

	//getters & setters
	public int getProductId() {
		return productId;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}
	}

	public void display() {
		System.out.println("Product Id: "+productId+"\nName: "+name+"\nPrice: "+price);
	}
}
