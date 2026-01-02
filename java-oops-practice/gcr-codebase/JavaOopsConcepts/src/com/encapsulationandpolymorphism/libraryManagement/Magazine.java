package com.encapsulationandpolymorphism.libraryManagement;

public class Magazine extends LibraryItem implements Reservable {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    //Abstract method override
    @Override
    public int getLoanDuration() {
        return 7; 	//7 days
    }

    //Interface methods override
    @Override
    public void reserveItem() {
        System.out.println("Magazine reserved successfully.");
    }
    @Override
    public boolean checkAvailability() {
        return true;
    }
}
