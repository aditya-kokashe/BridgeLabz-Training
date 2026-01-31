package com.csvdatahandling.dbtocsv;

import java.io.*;
import java.sql.*;

public class EmployeeCSVReport {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String password = "hinata2320"; 

        String csvPath = "output/employees_report.csv";

        String query = "SELECT id, name, department, salary FROM employees";

        File file = new File(csvPath);
        file.getParentFile().mkdirs(); 

        try (
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file))
        ) {

            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            while (rs.next()) {
                bw.write(
                        rs.getInt("id") + "," +
                        rs.getString("name") + "," +
                        rs.getString("department") + "," +
                        rs.getDouble("salary")
                );
                bw.newLine();
            }

            System.out.println("CSV report generated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
