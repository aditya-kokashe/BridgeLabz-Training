package com.encapsulationandpolymorphism.libraryManagement;

public class Book extends LibraryItem implements Reservable {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    //Abstract method override
    @Override
    public int getLoanDuration() {
        return 10; 	//10 days
    }

    //Override the interface methods
    @Override
    public void reserveItem() {
        System.out.println("Book reserved successfully.");
    }
    @Override
    public boolean checkAvailability() {
        return true;
    }
}

