package com.day5.BookBazaar;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author,
                       double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        double total = price * quantity;
        double discount = total * 0.10; // 10% discount
        return total - discount;
    }
}
