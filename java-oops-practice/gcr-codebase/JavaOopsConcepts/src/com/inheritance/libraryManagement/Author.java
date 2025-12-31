package com.inheritance.libraryManagement;

public class Author extends Book{

	String name;
	String bio;
	public Author(String title, int publicationYear, String name, String bio) {
		super(title, publicationYear);
		this.bio = bio;
		this.name = name;
	}
	
	void displayInfo() {
		System.out.println("Title: "+ title+"\nPublication Year: "+ publicationYear+"\nName: "+name+"\nBio: "+ bio);
	}

}
