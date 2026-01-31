package com.csvdatahandling.largecsvprocessing;

import java.io.*;
import java.util.*;

public class LargeCSVReader {

    private static final int BATCH_SIZE = 100;

    public static void main(String[] args) {

        InputStream is =
                LargeCSVReader.class.getResourceAsStream("large_employees.csv");

        if (is == null) {
            throw new RuntimeException("CSV file not found in package");
        }

        int totalRecords = 0;
        List<String> batch = new ArrayList<>(BATCH_SIZE);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String line;

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                batch.add(line);

                if (batch.size() == BATCH_SIZE) {
                    processBatch(batch);
                    totalRecords += batch.size();
                    batch.clear();
                }
            }

            // process remaining lines
            if (!batch.isEmpty()) {
                processBatch(batch);
                totalRecords += batch.size();
            }

            System.out.println("Total records processed: " + totalRecords);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processBatch(List<String> batch) {
        System.out.println("Processing batch of size: " + batch.size());
    }
}
