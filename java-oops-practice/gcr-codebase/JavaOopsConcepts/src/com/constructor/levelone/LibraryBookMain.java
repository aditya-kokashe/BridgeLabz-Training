package com.constructor.levelone;

public class LibraryBookMain {

	public static void main(String[] args) {
		 LibraryBook book1 = new LibraryBook("1984", "George Orwell", 399);

		 book1.displayBook();
		 System.out.println();
		 //First borrow
		 book1.borrowBook();   
		 System.out.println();
		 //Second borrow attempt
		 book1.borrowBook();   
		 System.out.println();

		 book1.displayBook();
		 System.out.println();

	}

}
