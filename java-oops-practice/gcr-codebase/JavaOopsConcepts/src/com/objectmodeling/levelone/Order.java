package com.objectmodeling.levelone;

import java.util.ArrayList;
public class Order {

    int orderId;
    ArrayList<Product> products;   // Aggregation

    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        double total = 0;

        for (Product p : products) {
            System.out.println(p.getProductName() + " : " + p.getPrice());
            total += p.getPrice();
        }

        System.out.println("Total Bill: " + total);
    }
}
