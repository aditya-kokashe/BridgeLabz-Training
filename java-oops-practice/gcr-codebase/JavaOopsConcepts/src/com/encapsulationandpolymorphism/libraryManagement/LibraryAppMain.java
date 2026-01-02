package com.encapsulationandpolymorphism.libraryManagement;

import java.util.*;
public class LibraryAppMain {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Atomic Habits", "James"));
        items.add(new Magazine(2, "Time", "Time Editors"));
        items.add(new DVD(3, "Interstellar", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem();
            }
        }
    }
}

