package com.linkedlist.DoublyLinkedList.MovieManagementSystem;

public class MovieManagementMain {
    public static void main(String[] args) {

        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addAtBeginning("Bahubali", "SSR", 2015, 9.0);
        list.addAtEnd("Inception", "Nolan", 2010, 8.8);
        list.addAtEnd("Avatar", "James", 2009, 8.0);
        list.addAtPosition(2, "Superman", "Gunn", 2025, 7.4);

        list.displayForward();
        list.displayReverse();

        list.searchByDirector("Nolan");
        list.updateRating("Superman", 8.1);
        list.removeByTitle("Avatar");

        list.displayForward();
    }
}
