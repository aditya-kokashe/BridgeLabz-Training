package com.objectmodeling.levelone;

public class EcommerceMain {

    public static void main(String[] args) {

        Ecustomer c1 = new Ecustomer(501, "Priyanka");

        Product p1 = new Product(1001, "Laptop", 65000);
        Product p2 = new Product(1002, "Mouse", 800);
        Product p3 = new Product(1003, "Keyboard", 1500);

        Order order1 = new Order(9001);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(9002);
        order2.addProduct(p3);

        c1.placeOrder(order1);
        c1.placeOrder(order2);

        c1.showOrders();
    }
}
