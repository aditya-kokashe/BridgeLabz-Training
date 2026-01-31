package com.jsondata.handson.dbtojson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.json.JSONArray;
import org.json.JSONObject;

public class DatabaseToJsonReport {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "hinata2320";

        JSONArray jsonArray = new JSONArray();

        try {
            // Load driver (optional in newer JDBC, but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                JSONObject obj = new JSONObject();

                obj.put("id", rs.getInt("id"));
                obj.put("name", rs.getString("name"));
                obj.put("age", rs.getInt("age"));
                obj.put("email", rs.getString("email"));

                jsonArray.put(obj);
            }

            System.out.println(jsonArray.toString(2));

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
