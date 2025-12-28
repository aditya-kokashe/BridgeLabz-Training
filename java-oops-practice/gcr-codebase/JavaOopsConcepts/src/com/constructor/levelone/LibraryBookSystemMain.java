package com.constructor.levelone;

public class LibraryBookSystemMain {

	public static void main(String[] args) {
		
		EBook book1 = new EBook ("CBM1234", "Immortals", "George");
		book1.displayBookDetails();
		
		//Update the author 
		book1.setAuthor("Mohit");
		System.out.println("Updated Author: "+ book1.getAuthor());
		
	}

}
