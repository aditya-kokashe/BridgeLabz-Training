package com.objectmodeling.levelone;

public class LibraryMain {

	public static void main(String[] args) {

		//object for book and library
		Book b1 = new Book("Immortals of Meluha","Amish");
		Book b2 = new Book("Krishna Key","Ashwin Sanghi");
		
		Library l1 = new Library("City library");
		Library l2 = new Library("College library");
		
		//city library
		l1.addBook(b1);
		l1.addBook(b2);
		
		//college library
		l2.addBook(b1);
		l2.addBook(b2);
		
		//display books
		l1.showBook();
		l2.showBook();
		
	}

}
