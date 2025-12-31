package com.inheritance.libraryManagement;

public class Book {

	String title;
	int publicationYear;
	public Book(String title, int publicationYear) {
		this.publicationYear = publicationYear;
		this.title = title;
	}
	
	void displayInfo() {
		System.out.println("Title: "+ title+"\nPublication Year: "+ publicationYear);
	}

}
