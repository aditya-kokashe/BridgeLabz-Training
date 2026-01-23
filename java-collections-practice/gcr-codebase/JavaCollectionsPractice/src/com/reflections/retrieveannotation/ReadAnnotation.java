package com.reflections.retrieveannotation;

public class ReadAnnotation {
    public static void main(String[] args) {
        Author author = Book.class.getAnnotation(Author.class);
        System.out.println("Author: " + author.name());
    }
}
