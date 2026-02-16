package com.jdbc.transactionmanagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/bank_system";
    private static final String USER = "root";
    private static final String PASSWORD = "hinata2320";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("Connection Failed!", e);
        }
    }
}
