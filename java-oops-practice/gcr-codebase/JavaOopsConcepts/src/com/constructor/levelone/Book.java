package com.constructor.levelone;
public class Book {
	
	String title;
	String author;
	int price;
	
	//Default constructor
	public Book(){
		title = "Atomic Habits";
		author = "James Clear";
		price = 1200;
	}
	
	//Parameterized Constructor
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//Display book details
	void displayBookDetails() {
		System.out.println("Book Title: "+ title);
		System.out.println("Book author: "+ author);
		System.out.println("Book price: "+ price);
	}

}
