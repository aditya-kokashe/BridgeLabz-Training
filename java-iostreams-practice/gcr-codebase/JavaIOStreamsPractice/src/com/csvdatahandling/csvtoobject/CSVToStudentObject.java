package com.csvdatahandling.csvtoobject;

import java.io.*;
import java.util.*;

public class CSVToStudentObject {

    public static void main(String[] args) {

    	String filePath = "src/com/csvdatahandling/csvtoobject/students.csv";

    	List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int marks = Integer.parseInt(data[2]);

                students.add(new Student(id, name, marks));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print all students
        students.forEach(System.out::println);
    }
}
