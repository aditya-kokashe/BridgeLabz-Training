package com.csvdatahandling.jsontocsv;

import java.io.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class CsvToJson {

    public static void main(String[] args) {

        String csvPath  = "output/students.csv";
        String jsonPath = "output/students_from_csv.json";

        new File("data").mkdirs();

        try (
            BufferedReader br = new BufferedReader(new FileReader(csvPath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(jsonPath))
        ) {
            JSONArray arr = new JSONArray();

            String header = br.readLine(); // skip header
            String line;

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");

                JSONObject o = new JSONObject();
                o.put("id", Integer.parseInt(d[0]));
                o.put("name", d[1]);
                o.put("marks", Integer.parseInt(d[2]));

                arr.put(o);
            }

            bw.write(arr.toString(2));
            System.out.println("CSV → JSON done");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
