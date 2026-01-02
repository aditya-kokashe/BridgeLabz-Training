package com.encapsulationandpolymorphism.fooddelivery;

import java.util.*;
public class Main {

    public static void processOrder(List<FoodItem> order) {
        double grandTotal = 0;
        
        for(FoodItem item : order){

            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                discount = ((Discountable) item).applyDiscount();
            }

            double finalPrice = total - discount;
            grandTotal += finalPrice;

            System.out.println("Total: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }

        System.out.println("GRAND TOTAL: " + grandTotal);
    }

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Burger", 120, 2));
        order.add(new NonVegItem("Chicken Wrap", 180, 1));

        processOrder(order);
    }
}
