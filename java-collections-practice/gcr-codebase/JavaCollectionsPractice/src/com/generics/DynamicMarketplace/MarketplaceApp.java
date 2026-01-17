package com.generics.DynamicMarketplace;

import java.util.ArrayList;
import java.util.List;

public class MarketplaceApp {
    public static void main(String[] args) {

        List<Product<?>> catalog = new ArrayList<>();
        Product<BookCategory> book =new Product<>("Java Programming", 500, new BookCategory());
        Product<ClothingCategory> shirt =new Product<>("T-Shirt", 800, new ClothingCategory());
        Product<GadgetCategory> phone =new Product<>("Smartphone", 15000, new GadgetCategory());

        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);
        

        // Apply discounts
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("\nMarketplace Catalog:\n");
        for (Product<?> p : catalog) {
            System.out.println(p.getDetails());
        }
    }
}
