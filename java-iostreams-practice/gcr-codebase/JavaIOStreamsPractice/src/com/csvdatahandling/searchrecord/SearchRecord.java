package com.csvdatahandling.searchrecord;

import java.io.*;

public class SearchRecord {
	public static void main(String[] args) {
		
		InputStream is = SearchRecord.class.getResourceAsStream("employees.csv");
		if(is == null) {
			System.out.println("File not found");
			return;
		}
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			String line;
			br.readLine();
			String nameFind = "Mohan Binod";
			while((line = br.readLine()) != null) {
				if(line.trim().isEmpty()) {
					continue;
				}
				String [] column = line.split(",");
				String name = column[1].trim();
				String department = column[2].trim();
				double salary = Double.parseDouble(column[3].trim());
				
				if(name.equals(nameFind)) {
					System.out.println("Name : "+ name);
					System.out.println("Department :  " + department);
					System.out.println("Salary : " + salary);
					return;
				}
			}
			System.out.println("Record not found");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
