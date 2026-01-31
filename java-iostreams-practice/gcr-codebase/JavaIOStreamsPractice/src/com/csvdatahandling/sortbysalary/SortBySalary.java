package com.csvdatahandling.sortbysalary;

import java.io.*;
import java.util.*;

public class SortBySalary {

    public static void main(String[] args) throws Exception {

        List<String[]> employees = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("src/com/csvdatahandling/sortbysalary/employees.csv"));
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            employees.add(line.split(","));
        }
        br.close();

        // Sort by Salary (index 3) descending
        employees.sort((a, b) ->
                Double.compare(
                        Double.parseDouble(b[3]),
                        Double.parseDouble(a[3])
                )
        );

        System.out.println("Top 5 Highest Paid Employees:");
        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            String[] e = employees.get(i);
            System.out.println(e[1] + " - " + e[3]);
        }
    }
}
