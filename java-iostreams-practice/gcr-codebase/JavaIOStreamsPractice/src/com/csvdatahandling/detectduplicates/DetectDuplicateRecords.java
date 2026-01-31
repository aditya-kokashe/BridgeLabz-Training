package com.csvdatahandling.detectduplicates;

import java.io.*;
import java.util.*;

public class DetectDuplicateRecords {

    public static void main(String[] args) {

        InputStream is =
                DetectDuplicateRecords.class.getResourceAsStream("employees.csv");

        if (is == null) {
            throw new RuntimeException("CSV file not found in package");
        }

        Set<String> seenIds = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String line;

            br.readLine(); // skip header

            System.out.println("Duplicate Records:");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String id = data[0];

                if (!seenIds.add(id)) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
