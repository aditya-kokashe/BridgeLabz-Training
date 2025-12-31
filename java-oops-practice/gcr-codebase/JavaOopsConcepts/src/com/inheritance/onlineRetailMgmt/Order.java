package com.inheritance.onlineRetailMgmt;

public class Order {

	int orderId;
	String orderDate;
	public Order(int orderId, String orderDate) {
		this.orderDate = orderDate;
		this.orderId = orderId;
	}
	
	void getOrderStatus() {
		System.out.println("Order Id: "+orderId+"\nOrder Date: "+orderDate);
	
	}

}
