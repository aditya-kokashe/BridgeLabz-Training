package com.day1.BookShelf;

public class BookShelfMain {

    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", new Book("1984", "George Orwell"));
        shelf.addBook("Fiction", new Book("Gone Girl", "Gillian Flynn"));
        shelf.addBook("Science", new Book("Cosmos", "Carl Sagan"));

        shelf.displayCatalog();

        System.out.println("\nAfter Borrowing:");
        shelf.removeBook("Fiction", "1984");
        shelf.displayCatalog();
    }
}