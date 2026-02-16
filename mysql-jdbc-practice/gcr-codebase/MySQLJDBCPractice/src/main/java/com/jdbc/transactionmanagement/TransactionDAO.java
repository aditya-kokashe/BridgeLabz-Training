package com.jdbc.transactionmanagement;

import java.sql.*;

public class TransactionDAO {

    public void showTransactions() {

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Transaction_History")) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("txn_id") + " | " +
                        rs.getInt("from_account") + " | " +
                        rs.getInt("to_account") + " | " +
                        rs.getDouble("amount") + " | " +
                        rs.getTimestamp("txn_date")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
