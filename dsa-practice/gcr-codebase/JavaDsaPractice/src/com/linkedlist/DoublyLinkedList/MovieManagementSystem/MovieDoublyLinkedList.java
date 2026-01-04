package com.linkedlist.DoublyLinkedList.MovieManagementSystem;

public class MovieDoublyLinkedList {

    private MovieNode head;
    private MovieNode tail;

    // Add at Beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // Add at End
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    // Add at Position
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode node = new MovieNode(title, director, year, rating);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    // Remove by Title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println(" No movies found!");
            return;
        }

        MovieNode temp = head;
        while (temp != null && !temp.title.equalsIgnoreCase(title))
            temp = temp.next;

        if (temp == null) {
            System.out.println(" Movie not found!");
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

        System.out.println(" Movie Removed");
    }

    // Search by Director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
            }
            temp = temp.next;
        }
    }

    // Search by Rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
            }
            temp = temp.next;
        }
    }

    // Update Rating
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println(" Rating Updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println(" Movie not found!");
    }

    // Display Forward
    public void displayForward() {
        System.out.println("\n Movies (Forward):");
        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display Reverse
    public void displayReverse() {
        System.out.println("\n Movies (Reverse):");
        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    private void displayMovie(MovieNode m) {
        System.out.println(" "+m.title + "    \t" + m.director + " \t " + m.year + " \t Rating: " + m.rating);
    }
}
