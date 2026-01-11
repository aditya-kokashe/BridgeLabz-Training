package com.day1.BookShelf;

import java.util.HashMap;
import java.util.LinkedList;

public class BookShelf {

    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    public void addBook(String genre, Book book) {
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
    }

    public void removeBook(String genre, String title) {
        if (catalog.containsKey(genre)) {
            catalog.get(genre).removeIf(b -> b.title.equals(title));
        }
    }

    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " : " + catalog.get(genre));
        }
    }
}