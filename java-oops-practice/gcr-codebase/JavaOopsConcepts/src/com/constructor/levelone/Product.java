package com.constructor.levelone;

public class Product {
	
	//Instance variable
	String productName;
	double price;
	
	//Class variable
	static int totalProducts = 0;
	
	//Parameterized constructor
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	//Instance method
	public void displayProductDetails() {
		System.out.println("Product name: "+ productName );
		System.out.println("Price: "+ price);
	}
	
	//Class method
	static void displayTotalProducts() {
		System.out.println("Total Products Created: "+ totalProducts);
	}
	
}
