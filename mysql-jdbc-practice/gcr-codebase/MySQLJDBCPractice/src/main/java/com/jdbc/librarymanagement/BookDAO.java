package com.jdbc.librarymanagement;

import java.sql.*;

public class BookDAO {

    public void addBook(Book book) {

        String sql = "INSERT INTO Book VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, book.getBookId());
            ps.setString(2, book.getTitle());
            ps.setString(3, book.getAuthor());
            ps.setString(4, book.getCategory());
            ps.setInt(5, book.getAvailableCopies());

            ps.executeUpdate();
            System.out.println("Book Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showBooksByCategory(String category) {

        String sql = "SELECT * FROM Book WHERE category = ? AND available_copies > 0";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, category);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("book_id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getString("author") + " | " +
                        rs.getInt("available_copies")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
