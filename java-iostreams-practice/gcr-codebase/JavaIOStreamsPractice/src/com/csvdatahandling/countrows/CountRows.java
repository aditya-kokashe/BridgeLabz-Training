package com.csvdatahandling.countrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CountRows{
	 public static void main(String[] args) {
		 	InputStream is = CountRows.class.getResourceAsStream("records.csv");

	        if (is == null) {
	            System.out.println("file not found");
	            return;
	        }
	        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
	            String line;
	            int count = 0;
	            br.readLine();
	            while ((line = br.readLine()) != null) {
	                if (!line.trim().isEmpty()) {
	                    count++;
	                }
	            }
	            System.out.println("Number of records found : "+ count);
	        } catch (IOException e) {
	        	System.out.println("file not found");
	            e.printStackTrace();
	        }
	 }
}
