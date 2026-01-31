package com.lambda.ecommerce;

class Product {
    String name;
    double price;
    double rating;
    int discount;

    Product(String name, double price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " -> Price : " + price + ", Rating : " + rating + ", Discount :  " + discount + "% off";
    }
}
