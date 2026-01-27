package com.csvdatahandling.writecsvfile;

import java.io.*;

public class WriteCSV {
	
	public static void main(String[] args) {
		String filePath = "src/com/csvdatahandling/writecsvfile/employee.csv";
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	    	
	    	
	        writer.write("ID,Name,Department,Salary\n");
	        writer.write("101,Mohan Binod,Finance,62000\n");
	        writer.write("102,Babu yadav,Finance,72000\n");
	        writer.write("103,Alice Williams,Finance,82000\n");
	        writer.write("104,Pappu Mishra,Finance,62000\n");
	        writer.write("105,Bob Johnson,Sales,58000\n");
	        System.out.println("CSV file written successfully!");
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	}
	
}
