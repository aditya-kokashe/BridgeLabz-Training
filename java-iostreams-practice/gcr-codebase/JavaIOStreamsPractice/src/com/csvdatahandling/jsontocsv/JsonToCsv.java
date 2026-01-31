package com.csvdatahandling.jsontocsv;

import java.io.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonToCsv {

    public static void main(String[] args) {

        String jsonPath = "output/students.json";
        String csvPath  = "output/students.csv";

        new File("data").mkdirs();

        try (
            BufferedReader br = new BufferedReader(new FileReader(jsonPath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(csvPath))
        ) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) sb.append(line);

            JSONArray arr = new JSONArray(sb.toString());

            // header
            bw.write("id,name,marks");
            bw.newLine();

            for (int i = 0; i < arr.length(); i++) {
                JSONObject o = arr.getJSONObject(i);
                bw.write(o.getInt("id") + "," + o.getString("name") + "," + o.getInt("marks"));
                bw.newLine();
            }

            System.out.println("JSON → CSV done");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
