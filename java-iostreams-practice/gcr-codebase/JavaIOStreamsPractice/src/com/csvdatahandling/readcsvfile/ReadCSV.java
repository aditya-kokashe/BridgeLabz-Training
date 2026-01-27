package com.csvdatahandling.readcsvfile;

import java.io.*;
import java.util.*;

public class ReadCSV {
	 public static void main(String[] args) {
		 	InputStream is = ReadCSV.class.getResourceAsStream("students.csv");

	        if (is == null) {
	            System.out.println("file not found");
	            return;
	        }
	        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] columns = line.split(",");
	                if (columns.length < 4) {
	                    continue;
	                }
	                System.out.println(columns[0] +  columns[1] + columns[2] +  columns[3]);
	            }
	        } catch (IOException e) {
	        	System.out.println("file not found");
	            e.printStackTrace();
	        }
	 }
}
