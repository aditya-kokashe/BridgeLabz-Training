package com.jsondata.filterjson;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class FilterJsonByAge {

    public static void main(String[] args) {

        String jsonData = "["
                + "{ \"name\": \"Anubhav\", \"age\": 22 },"
                + "{ \"name\": \"Amit\", \"age\": 28 },"
                + "{ \"name\": \"Ayush\", \"age\": 30 }"
                + "]";

        try {
            JSONArray users = new JSONArray(jsonData);

            for (int i = 0; i < users.length(); i++) {
                JSONObject user = users.getJSONObject(i);

                int age = user.getInt("age");

                if (age > 25) {
                    System.out.println(user.toString(2));
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
