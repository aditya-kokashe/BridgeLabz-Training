package com.day7.FoodLoop;

public class FoodLoopMain {
	public static void main(String [] agrs) {
		FoodItem item1 = new NonVegItem("Chicken Breast", "Main Course", 1020, false);
		FoodItem item2 = new VegItem("Pasta", "Starter", 80, false);
		
		FoodItem[] items = {item1, item2};
		for(FoodItem item: items) {
			item.getDetails();
			item.getPrice();
		}
		
		Order order = new Order(item1, item2);
		order.placeOrder();
		order.cancelOrder();
	}

}
