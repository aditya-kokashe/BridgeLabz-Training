package com.day5.BookBazaar;

public class BookBazaarMain {

    public static void main(String[] args) {

        Book printedBook = new PrintedBook(
                "1984", "George Orwell", 500, 10
        );

        Book ebook = new EBook(
                "Gone Girl", "Gillian FLynn", 300, 50
        );

        printedBook.displayBook();
        ebook.displayBook();

        System.out.println();

        Order order1 = new Order("Ayush", printedBook, 2);
        order1.processOrder();
        order1.displayOrder();

        System.out.println();

        Order order2 = new Order("Aarya", ebook, 3);
        order2.processOrder();
        order2.displayOrder();
    }
}

