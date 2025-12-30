package com.objectmodeling.levelone;

import java.util.ArrayList;
public class Ecustomer {

    int customerId;
    String name;
    ArrayList<Order> orders;    // Association

    public Ecustomer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed Order ID " + order);
        orders.add(order);
    }

    public void showOrders() {
        System.out.println("\nOrders placed by " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}
