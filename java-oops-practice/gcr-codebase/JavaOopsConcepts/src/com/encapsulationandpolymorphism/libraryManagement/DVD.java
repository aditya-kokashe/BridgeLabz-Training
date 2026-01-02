package com.encapsulationandpolymorphism.libraryManagement;

public class DVD extends LibraryItem implements Reservable {

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    //Abstract method override
    @Override
    public int getLoanDuration() {
        return 3; 	//3 days
    }

    //Interface methods override
    @Override
    public void reserveItem() {
        System.out.println("DVD reserved successfully.");
    }
    @Override
    public boolean checkAvailability() {
        return false;
    }
}
