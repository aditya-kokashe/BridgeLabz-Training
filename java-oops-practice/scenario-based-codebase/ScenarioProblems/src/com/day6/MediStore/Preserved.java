package com.day6.MediStore;

import java.time.LocalDate;

public class Preserved extends Medicine implements ISellable{

	private double totalPrice;
	private double discount;
	private String stockAdjustments;
	boolean isExpired = false;
	
	public Preserved(String name, String expiryDate, double price, int quantity, double totalPrice, double discount, String stockAdjustments) {
		super(name,expiryDate, price,quantity);
		this.totalPrice = totalPrice;
		this.discount = discount;
		this.stockAdjustments = stockAdjustments;
	}

	@Override
	public void checkExpiry() {
		LocalDate exp = LocalDate.parse(getExpiryDate());
        LocalDate today = LocalDate.now();
		if(exp.isBefore(today)) {
			isExpired = true;
		}else {
			isExpired = false;
		}
	}
	@Override
	public void sell() {
		checkExpiry();
		if(isExpired) {
			System.out.println("Cannot sell "+ getName()+ " medicine, \nBecause it is expired!");
		}else {
			totalPrice = (getPrice()*getQuantity())-discount;
			System.out.println("\nMed: "+ getName());
			System.out.println("Your total medicine purchase is off : "+ totalPrice);
		}
	}

	
	
}
