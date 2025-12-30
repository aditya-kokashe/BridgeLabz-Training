package com.objectmodeling.levelone;

import java.util.ArrayList;
public class Library {

	String libraryName;
	ArrayList<Book> books;
	
	//constructor
	public Library(String libraryName) {
		this.libraryName = 	libraryName;
		this.books = new ArrayList<>();	
	}
	
	//add book method
	public void addBook(Book book) {
		books.add(book);
	}
	
	//show book method
	public void showBook() {
		System.out.println("Library: "+ libraryName);
		for(Book b : books) {
			b.displayBook();
		}
	}
	

}
