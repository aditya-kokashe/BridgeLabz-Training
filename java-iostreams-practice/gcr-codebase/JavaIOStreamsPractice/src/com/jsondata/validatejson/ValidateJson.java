package com.jsondata.validatejson;

import org.json.JSONObject;
import org.json.JSONException;

public class ValidateJson {

    public static void main(String[] args) {

        // Try changing this JSON to test
        String jsonString = "{ \"name\": \"Prateek\", \"age\": 22 }";

        try {
            // Attempt to parse JSON
            new JSONObject(jsonString);

            System.out.println("Valid JSON structure");

        } catch (JSONException e) {
            System.out.println("Invalid JSON structure");
        }
    }
}
