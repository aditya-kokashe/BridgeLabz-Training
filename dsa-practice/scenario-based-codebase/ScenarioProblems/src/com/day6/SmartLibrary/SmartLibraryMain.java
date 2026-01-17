package com.day6.SmartLibrary;

public class SmartLibraryMain {
	public static void main(String[] args) {
		
		Book[] books = {
				new Book("Madagaskar"),
				new Book("Param Shankar"),
				new Book("KGF"),
				new Book("Bali"),
		};
		
		InsertionSort.sort(books);
		
		for(Book b : books) {
			System.out.println(b.title);
		}
		
	}

}
