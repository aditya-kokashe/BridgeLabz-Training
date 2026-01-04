package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class BookNode {
    int id;
    String title;
    String author;
    String type;
    boolean available;

    BookNode next;
    BookNode prev;

    public BookNode(int id, String title, String author, String type, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.type = type;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}
