package com.inheritance.onlineRetailMgmt;

public class ShippedOrder extends Order{

	int trackingNumber;
	public ShippedOrder(int orderId, String orderDate, int trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	void getOrderStatus() {
		System.out.println("Order Id: "+orderId+"\nOrder Date: "+orderDate+"\nTracking Number: "+trackingNumber);
	
	}
}
