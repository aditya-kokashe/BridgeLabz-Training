package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class LibraryList {

    private BookNode head;
    private BookNode tail;

    // Add at End (simple)
    public void addBook(int id, String title, String author, String genre, boolean available) {
        BookNode node = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    // Remove by ID
    public void removeBook(int id) {
        BookNode temp = head;

        while (temp != null && temp.id != id)
            temp = temp.next;

        if (temp == null) {
            System.out.println(" Book Not Found");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        }
        else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println(" Book Removed");
    }

    // Search by Title
    public void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title))
                displayBook(temp);
            temp = temp.next;
        }
    }

    // Search by Author
    public void searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author))
                displayBook(temp);
            temp = temp.next;
        }
    }

    // Update Availability
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.available = status;
                System.out.println(" Status Updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println(" Book Not Found");
    }

    // Display Forward
    public void displayForward() {
        BookNode temp = head;
        System.out.println("\n Library Books: ");
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display Reverse
    public void displayReverse() {
        BookNode temp = tail;
        System.out.println("\n Library Books (Reverse): ");
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count Books
    public void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(" Total Books = " + count);
    }

    private void displayBook(BookNode b) {
        System.out.println(" "+b.id + "\t " + b.title + "\t   " + b.author + "\t  " + b.type +
                "\t   Available: " + b.available);
    }
}
