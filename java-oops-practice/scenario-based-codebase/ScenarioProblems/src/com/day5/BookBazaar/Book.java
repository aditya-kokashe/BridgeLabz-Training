package com.day5.BookBazaar;

public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock;          // encapsulated inventory

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Controlled stock update
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }

    public void displayBook() {
        System.out.println(
                title + " | " + author +
                " | INR " + price +
                " | Stock: " + stock
        );
    }
}

