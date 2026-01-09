package com.day7.FoodLoop;

import java.util.*;
public class Order implements IOrderable{

	private List<FoodItem> items = new ArrayList<>();
	public double total;
	public double discount;
	
	public Order() {

	}
	public Order(FoodItem f1, FoodItem f2) {
		items.add(f1);
		items.add(f2);
	}

	public void addItem(FoodItem item) {
		items.add(item);
	}
	
	//Apply discount
	public double applyDiscount() {
		if(total > 1000) {
			return total*0.15;	//15% discount
		}else {
			return total*0.05;	//5% discount
		}
	}
	
	@Override
	public void placeOrder() {
		total = 0;
		for(FoodItem item : items) {
			if(!item.isAvailable()) {
				System.out.println("This item is Out Of Stock");
				return ;
			}
			
			total += item.getPrice();
		}
		
		discount = applyDiscount();
		total = total-discount;
		
		System.out.println("\n Order placed"+"\n Discount: "+discount);
		System.out.println("+--------------------------+");
		System.out.println(" Total amount: "+total);
		System.out.println("+--------------------------+");
		
	}
	@Override
	public void cancelOrder() {
		System.out.println(" Order cancelled");
		items.clear();
		
	}
}


















