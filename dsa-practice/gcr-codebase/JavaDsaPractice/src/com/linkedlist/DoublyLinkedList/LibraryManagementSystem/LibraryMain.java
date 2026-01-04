package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class LibraryMain {
    public static void main(String[] args) {

        LibraryList lib = new LibraryList();

        lib.addBook(1, "Odyssey", "Homer", "story", true);
        lib.addBook(2, "Dune", "Frank", "story", true);
        lib.addBook(3, "Java", "James", "Study", false);

        lib.displayForward();
        lib.displayReverse();

        lib.searchByAuthor("Frank");
        lib.updateAvailability(3, true);
        lib.removeBook(2);

        lib.displayForward();
        lib.countBooks();
    }
}
