package com.designpattern.librarymanagementsystem;

import java.util.List;

public class LibraryApp {

    public static void main(String[] args) {

        // Singleton
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Builder
        Book book = new Book.BookBuilder("Data Structures by Cormen")
                .authors(List.of("Cormen", "Leiserson"))
                .edition("3rd")
                .genre("Computer Science")
                .publisher("MIT Press")
                .build();

        catalog.addBook(book);

        // Factory
        User user1 = UserFactory.createUser("student");
        user1.getRole();

        // Observer
        BookNotifier notifier = new BookNotifier();
        notifier.subscribe(new UserObserver("Aditya"));
        notifier.subscribe(new UserObserver("Faculty User"));

        notifier.notifyUsers("Data Structures by Cormen is now available!");
    }
}
