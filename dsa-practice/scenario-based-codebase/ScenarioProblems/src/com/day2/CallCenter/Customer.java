package com.day2.CallCenter;

public class Customer {
	String name;
	boolean isVip;
	
	public Customer(String name, boolean isVip) {
		this.name= name;
		this.isVip = isVip;
	}
	
	@Override
	public String toString() {
		return name + (isVip ? " (VIP) " : " ");
	}
}
