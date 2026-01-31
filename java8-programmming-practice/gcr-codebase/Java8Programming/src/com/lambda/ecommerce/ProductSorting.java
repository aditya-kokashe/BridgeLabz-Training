package com.lambda.ecommerce;

import java.util.*;

public class ProductSorting {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 60000, 4.5, 10),
                new Product("Phone", 30000, 4.7, 15),
                new Product("Headphones", 3000, 4.2, 25)
        );

        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:\n");
        products.forEach(System.out::println);

        // Sort by rating
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:\n");
        products.forEach(System.out::println);

        // Sort by discount
        products.sort((p1, p2) -> Integer.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:\n");
        products.forEach(System.out::println);
    }
}
