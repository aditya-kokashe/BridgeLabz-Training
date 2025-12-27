package com.constructor.levelone;

public class BookDetails {

	public static void main(String[] args) {
		
		//Default constructor
		Book book1 = new Book();
		System.out.println("Book 1: ");
		book1.displayBookDetails();
		
		//Parameterized constructor
		Book book2 = new Book("Krishna Key", "Ashwin Sanghi", 1500);
		System.out.println("Book 2: ");
		book2.displayBookDetails();
	}
}
