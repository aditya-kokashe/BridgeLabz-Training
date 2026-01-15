package com.day4.SmartShelf;

public class SmartShelfMain {
    public static void main(String[] args) {

        Book[] list = {
            new Book("Algorithms"),
            new Book("Java"),
            new Book("Data Structures"),
            new Book("Operating Systems"),
            new Book("Cloud Computing")
        };

        SmartShelf.insertionSort(list);

        System.out.println("Reading List: ");
        for (Book b : list) {
            System.out.println(b.title);
        }
    }
}
