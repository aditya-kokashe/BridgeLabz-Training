package com.day9.TailorShop;

public class TailorShopMain {

    public static void main(String[] args) {

        TailorShop shop = new TailorShop(10);

        shop.addOrder(new Order("ORDER101", 5));
        shop.addOrder(new Order("ORDER102", 2));
        shop.addOrder(new Order("ORDER103", 7));
        shop.addOrder(new Order("ORDER104", 1));

        System.out.println("Orders sorted by delivery deadline:\n");
        shop.displayOrders();
    }
}