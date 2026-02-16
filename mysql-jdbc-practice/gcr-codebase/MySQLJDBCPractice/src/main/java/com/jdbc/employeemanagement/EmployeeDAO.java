package com.jdbc.employeemanagement;

import java.sql.*;

public class EmployeeDAO {

	public void insertEmployee(Employee emp) {

	    String query = "INSERT INTO Employee VALUES (?, ?, ?)";

	    try (Connection con = DBConnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(query)) {

	        ps.setInt(1, emp.getId());
	        ps.setString(2, emp.getName());
	        ps.setDouble(3, emp.getSalary());

	        ps.executeUpdate();
	        System.out.println("Employee Inserted Successfully!");

	    } catch (SQLIntegrityConstraintViolationException e) {
	        System.out.println("Employee with ID " + emp.getId() + " already exists!");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
    public void getAllEmployees() {

        String query = "SELECT * FROM Employee";

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("Id") + " | " +
                        rs.getString("Name") + " | " +
                        rs.getDouble("Salary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateSalary(int id, double salary) {

        String query = "UPDATE Employee SET Salary = ? WHERE Id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Salary Updated Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {

        String query = "DELETE FROM Employee WHERE Id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Employee Deleted Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchByName(String name) {

        String query = "SELECT * FROM Employee WHERE Name = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("Id") + " | " +
                        rs.getString("Name") + " | " +
                        rs.getDouble("Salary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
