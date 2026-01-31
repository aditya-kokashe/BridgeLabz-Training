package com.collectors.orderrevenue;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
            new Order("Prakash", 1200.50),
            new Order("Rohit", 800.00),
            new Order("Abhinav", 450.75),
            new Order("Sneha", 1500.00),
            new Order("Rohit", 200.25)
        );

        Map<String, Double> revenueByCustomer =
                orders.stream()
                      .collect(Collectors.groupingBy(
                              Order::getCustomer,
                              Collectors.summingDouble(Order::getAmount)
                      ));

        System.out.println(revenueByCustomer);
    }
}
