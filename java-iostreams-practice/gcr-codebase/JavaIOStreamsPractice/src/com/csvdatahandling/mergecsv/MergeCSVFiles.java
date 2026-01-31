package com.csvdatahandling.mergecsv;

import java.io.*;
import java.util.*;

public class MergeCSVFiles {

    public static void main(String[] args) {

        InputStream is1 = MergeCSVFiles.class.getResourceAsStream("students1.csv");
        InputStream is2 = MergeCSVFiles.class.getResourceAsStream("students2.csv");

        if (is1 == null || is2 == null) {
            throw new RuntimeException("CSV file not found in package");
        }

        Map<String, String[]> map = new HashMap<>();

        try (
            BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));
            BufferedReader br2 = new BufferedReader(new InputStreamReader(is2))
        ) {

            String line;

            br1.readLine(); // header
            while ((line = br1.readLine()) != null) {
                String[] d = line.split(",");
                map.put(d[0], d);
            }

            System.out.println("ID,Name,Age,Marks,Grade");

            br2.readLine(); // header
            while ((line = br2.readLine()) != null) {
                String[] d2 = line.split(",");
                String[] d1 = map.get(d2[0]);

                if (d1 != null) {
                    System.out.println(
                        d1[0] + "," + d1[1] + "," + d1[2] + "," +
                        d2[1] + "," + d2[2]
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
