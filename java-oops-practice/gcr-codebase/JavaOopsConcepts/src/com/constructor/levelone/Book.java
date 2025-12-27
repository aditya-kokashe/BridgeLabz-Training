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

	public static void main(String[] args) {
		//Default constructor
		Book book1 = new Book();
		System.out.println("Book 1: ");
		book1.displayBookDetails();
		
		//Parameterized constructor
		Book book2 = new Book("Krishna Key", "Ashwin Sanghi", 1230);
		System.out.println("Book 2: ");
		book2.displayBookDetails();
	}

}
