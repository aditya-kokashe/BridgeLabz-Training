package com.day3.SwiftCart;

public class SwiftCartMain {

	public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50);
        Product rice = new NonPerishableProduct("Rice", 100);

        Cart cart = new Cart();
        cart.addProduct(milk, 2);
        cart.addProduct(rice, 1);

        cart.generateBill();

        double finalAmount = cart.applyDiscount(20);
        System.out.println("Final Amount after discount & coupon: " + finalAmount);
    }

}
