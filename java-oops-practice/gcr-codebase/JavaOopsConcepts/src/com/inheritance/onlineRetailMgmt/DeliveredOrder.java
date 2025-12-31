package com.inheritance.onlineRetailMgmt;

public class DeliveredOrder extends ShippedOrder{

	String deliveryDate;
	public DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
		super( orderId,  orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	
	void getOrderStatus() {
		System.out.println("\nOrder Id: "+orderId+"\nOrder Date: "+orderDate+"\nTracking Number: "+trackingNumber+"\nDelivery Date: "+deliveryDate);
	
	}

}
