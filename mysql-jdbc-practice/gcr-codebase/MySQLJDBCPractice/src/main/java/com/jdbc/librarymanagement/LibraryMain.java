package com.jdbc.librarymanagement;

public class LibraryMain {

    public static void main(String[] args) {

        BookDAO bookDAO = new BookDAO();
        BorrowDAO borrowDAO = new BorrowDAO();

        borrowDAO.borrowBook(101, 1, "2026-02-01");

        System.out.println("\nBorrow Records:");
        borrowDAO.showBorrowRecords();

        borrowDAO.returnBook(1, "2026-02-15");

        System.out.println("\nAfter Return:");
        borrowDAO.showBorrowRecords();

        System.out.println("\nAvailable Database Books:");
        bookDAO.showBooksByCategory("Database");
    }
}
