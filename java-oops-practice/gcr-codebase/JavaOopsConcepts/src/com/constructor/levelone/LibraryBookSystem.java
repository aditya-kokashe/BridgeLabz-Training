package com.constructor.levelone;

public class LibraryBookSystem {

	public String ISBN;
	protected String title;
	private String author;
	
	//Constructor
	public LibraryBookSystem(String ISBN, String title, String author) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
	//Public method to modify private author
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//Method to get author info
	public String getAuthor() {
		return author;
	}

}
