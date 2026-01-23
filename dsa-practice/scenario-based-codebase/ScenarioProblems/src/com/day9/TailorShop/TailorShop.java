package com.day9.TailorShop;

public class TailorShop {

    private Order[] orders;
    private int size;

    public TailorShop(int capacity) {
        orders = new Order[capacity];
        size = 0;
    }

    // Insert order in sorted order by deadline (ascending)
    public void addOrder(Order order) {

        int i = size - 1;

        while (i >= 0 && orders[i].deliveryDeadline > order.deliveryDeadline) {
            orders[i + 1] = orders[i];
            i--;
        }

        orders[i + 1] = order;
        size++;
    }

    public void displayOrders() {
        for (int i = 0; i < size; i++)
            System.out.println(orders[i]);
    }
}