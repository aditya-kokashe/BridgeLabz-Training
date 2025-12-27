package com.constructor.levelone;

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;
    
    //Constructor
	public LibraryBook(String title, String author, double price) {
		this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
	}
	
	public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book is already borrowed");
        }
    }

    //Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

}
