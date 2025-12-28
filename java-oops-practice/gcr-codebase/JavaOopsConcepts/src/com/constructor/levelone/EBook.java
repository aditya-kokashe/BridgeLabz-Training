package com.constructor.levelone;

public class EBook extends LibraryBookSystem{

	public EBook (String ISBN, String title, String author) {
		super (ISBN, title, author);
	}
	
	//Display book details
	public void displayBookDetails() {
		System.out.println("ISBN: " + ISBN);
		System.out.println("Title: " + title);
		System.out.println ("Author: " + getAuthor());
	}

}
