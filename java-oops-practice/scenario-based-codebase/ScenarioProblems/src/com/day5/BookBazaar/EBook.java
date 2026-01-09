package com.day5.BookBazaar;

public class EBook extends Book {

    public EBook(String title, String author,
                 double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        double total = price * quantity;
        double discount = total * 0.20; // higher discount
        return total - discount;
    }
}

