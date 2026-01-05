package com.day3.SwiftCart;

import java.util.ArrayList;
public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;   // protected calculation

    // Empty cart
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Cart with pre-selected items
    public Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        totalPrice += product.getPrice() * quantity; // operator usage
    }

    private void calculateTotal() {
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    @Override
    public double applyDiscount(double coupon) {
        double discount = 0;

        for (Product p : products) {
            discount += p.getPrice() * p.getDiscount(); // polymorphism
        }

        return totalPrice - discount - coupon; // operator usage
    }

    @Override
    public void generateBill() {
        System.out.println("SwiftCart Bill:");
        for (Product p : products) {
            System.out.println(p.getName() + " - " + p.getPrice());
        }
        System.out.println("Total Price: " + totalPrice);
    }
}
