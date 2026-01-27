package com.csvdatahandling.filterrecords;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class FilterRecord {

    public static void main(String[] args) {

        InputStream is = FilterRecord.class.getResourceAsStream("students.csv");

        if (is == null) {
            System.out.println("CSV file not found");
            return;
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;

            br.readLine();

            System.out.println("Students scoring more than 80 marks:");
            System.out.println("------------------------------------");

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] columns = line.split(",");

                int id = Integer.parseInt(columns[0].trim());
                String name = columns[1].trim();
                int age = Integer.parseInt(columns[2].trim());
                int marks = Integer.parseInt(columns[3].trim());

                //Filter condition
                if (marks > 80) {
                    System.out.println("ID    : " + id);
                    System.out.println("Name  : " + name);
                    System.out.println("Age   : " + age);
                    System.out.println("Marks : " + marks);
                    System.out.println("--------------------");
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}