package com.designpattern.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    private static LibraryCatalog instance;
    private List<Book> books;

    // private constructor (Singleton rule)
    private LibraryCatalog() {
        books = new ArrayList<>();
    }

    // global access point
    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    // ✅ THIS METHOD MUST EXIST
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to catalog: " + book.getTitle());
    }

    public List<Book> getBooks() {
        return books;
    }
}
