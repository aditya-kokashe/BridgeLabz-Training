package com.encapsulationandpolymorphism.eCommercePlatform;


public class ECommercePlatform {

	public static void main(String[] args) {
		Product a = new Electronics(102102, "AC", 12500);
		Product b = new Groceries(105, "Fruits", 120);
		Product c = new Clothing(2021, "Polo Shirt", 450);

		a.calculateDiscount();
		b.calculateDiscount();
		c.calculateDiscount();
		
		Product[] products = {a,b,c};

        for (Product product : products) {
            product.display();  
        }
	}

}
