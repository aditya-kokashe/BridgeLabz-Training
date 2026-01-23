package com.day7.FlashDealz;

public class Product {
    String name;
    int discount;

    public Product(String name, int discount) {
        this.name = name;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " : (Discount: " + discount + "%)";
    }
}