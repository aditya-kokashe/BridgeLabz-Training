package com.jdbc.librarymanagement;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String category;
    private int availableCopies;

    public Book(int bookId, String title, String author, String category, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.availableCopies = availableCopies;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public int getAvailableCopies() { return availableCopies; }
}
