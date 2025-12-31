package com.inheritance.onlineRetailMgmt;

public class OrderMain {

	public static void main(String[] args) {

		Order a = new ShippedOrder(101,"25 Dec",120120);
		Order b = new DeliveredOrder(523,"30 Dec",120120,"30 Dec");

		a.getOrderStatus();
		b.getOrderStatus();
	}

}
