package com.jsondata.handson.csvtojson;

import java.io.BufferedReader;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;

public class CsvToJson {

    public static void main(String[] args) {

        String path = "src/com/jsondata/handson/csvtojson/users.csv";
        JSONArray jsonArray = new JSONArray();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String headerLine = br.readLine();   // read header
            String[] headers = headerLine.split(",");

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                JSONObject obj = new JSONObject();
                for (int i = 0; i < headers.length; i++) {
                    obj.put(headers[i], values[i]);
                }

                jsonArray.put(obj);
            }

            System.out.println(jsonArray.toString(2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
