package com.day5.BookBazaar;

public class Order {

    private String userName;
    private Book book;
    private int quantity;

    private String status;   // restricted access

    public Order(String userName, Book book, int quantity) {
        this.userName = userName;
        this.book = book;
        this.quantity = quantity;
        this.status = "CREATED";
    }

    // Only internal process updates status
    private void setStatus(String status) {
        this.status = status;
    }

    public void processOrder() {
        if (book.reduceStock(quantity)) {
            setStatus("CONFIRMED");

            double finalCost = book.applyDiscount(quantity);

            System.out.println(
                    "Order Confirmed for " + userName +
                    " | Total Cost: INR " + finalCost
            );
        } else {
            setStatus("FAILED");
            System.out.println("Order Failed: Insufficient Stock");
        }
    }

    public void displayOrder() {
        System.out.println(
                "User: " + userName +
                " | Book: " + book.title +
                " | Quantity: " + quantity +
                " | Status: " + status
        );
    }
}

