package com.jdbc.librarymanagement;

import java.sql.*;

public class BorrowDAO {

    // Borrow Book
    public void borrowBook(int studentId, int bookId, String borrowDate) {

        try (Connection con = DBConnection.getConnection()) {

            // Reduce available copies
            PreparedStatement updateBook = con.prepareStatement(
                    "UPDATE Book SET available_copies = available_copies - 1 WHERE book_id = ?");
            updateBook.setInt(1, bookId);
            updateBook.executeUpdate();

            // Insert borrow record
            PreparedStatement insertBorrow = con.prepareStatement(
                    "INSERT INTO Borrow(student_id, book_id, borrow_date) VALUES (?, ?, ?)");

            insertBorrow.setInt(1, studentId);
            insertBorrow.setInt(2, bookId);
            insertBorrow.setDate(3, Date.valueOf(borrowDate));

            insertBorrow.executeUpdate();

            System.out.println("Book Borrowed Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Return Book + Fine
    public void returnBook(int borrowId, String returnDate) {

        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE Borrow SET return_date = ?, " +
                    "fine = (DATEDIFF(?, borrow_date) - 7) * 10 " +
                    "WHERE borrow_id = ?");

            ps.setDate(1, Date.valueOf(returnDate));
            ps.setDate(2, Date.valueOf(returnDate));
            ps.setInt(3, borrowId);

            ps.executeUpdate();

            // Increase available copies
            PreparedStatement updateBook = con.prepareStatement(
                    "UPDATE Book SET available_copies = available_copies + 1 " +
                    "WHERE book_id = (SELECT book_id FROM Borrow WHERE borrow_id = ?)");

            updateBook.setInt(1, borrowId);
            updateBook.executeUpdate();

            System.out.println("Book Returned Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showBorrowRecords() {

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Borrow")) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("borrow_id") + " | " +
                        rs.getInt("student_id") + " | " +
                        rs.getInt("book_id") + " | " +
                        rs.getDate("borrow_date") + " | " +
                        rs.getDate("return_date") + " | " +
                        rs.getDouble("fine")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
