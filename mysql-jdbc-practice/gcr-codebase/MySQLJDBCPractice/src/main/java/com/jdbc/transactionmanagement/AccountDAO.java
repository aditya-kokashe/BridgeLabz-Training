package com.jdbc.transactionmanagement;

import java.sql.*;

public class AccountDAO {

    public void transferMoney(int fromAcc, int toAcc, double amount) {

        Connection con = null;

        try {
            con = DBConnection.getConnection();

            // Disable auto-commit (start transaction)
            con.setAutoCommit(false);

            // Deduct from sender
            PreparedStatement deduct = con.prepareStatement(
                    "UPDATE Account SET balance = balance - ? WHERE account_no = ?");
            deduct.setDouble(1, amount);
            deduct.setInt(2, fromAcc);
            deduct.executeUpdate();

            // Add to receiver
            PreparedStatement add = con.prepareStatement(
                    "UPDATE Account SET balance = balance + ? WHERE account_no = ?");
            add.setDouble(1, amount);
            add.setInt(2, toAcc);
            add.executeUpdate();

            // Insert transaction record
            PreparedStatement insertTxn = con.prepareStatement(
                    "INSERT INTO Transaction_History(from_account, to_account, amount) VALUES (?, ?, ?)");

            insertTxn.setInt(1, fromAcc);
            insertTxn.setInt(2, toAcc);
            insertTxn.setDouble(3, amount);
            insertTxn.executeUpdate();

            // Commit transaction
            con.commit();

            System.out.println("Transaction Successful!");

        } catch (Exception e) {
            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction Failed! Rolled Back.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.setAutoCommit(true);
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void showAccounts() {

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Account")) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("account_no") + " | " +
                        rs.getString("holder_name") + " | " +
                        rs.getDouble("balance")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
