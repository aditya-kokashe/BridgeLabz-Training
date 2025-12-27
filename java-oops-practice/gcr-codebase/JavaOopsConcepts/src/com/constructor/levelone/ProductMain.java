package com.constructor.levelone;

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Product("Jerry", 1000);
		Product p2 = new Product("Tom", 2500);
		Product p3 = new Product("Slowbun", 2000);
		
		//Instance method call
		p1.displayProductDetails();
		System.out.println();
		p2.displayProductDetails();
		System.out.println();
		p3.displayProductDetails();
		System.out.println();
		
		//Class method call
		Product.displayTotalProducts();
	}

}
