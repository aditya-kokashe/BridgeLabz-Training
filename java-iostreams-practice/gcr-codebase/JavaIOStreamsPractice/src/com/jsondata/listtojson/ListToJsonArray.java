package com.jsondata.listtojson;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class ListToJsonArray {

    public static void main(String[] args) {

        try {
            // Create list of Java objects
            List<Student> students = new ArrayList<>();
            students.add(new Student("Vikash", 22));
            students.add(new Student("Maheep", 28));

            // JSON Array
            JSONArray jsonArray = new JSONArray();

            // Convert each object
            for (Student s : students) {
                JSONObject obj = new JSONObject();
                obj.put("name", s.getName());
                obj.put("age", s.getAge());

                jsonArray.put(obj);
            }

            // Print JSON Array
            System.out.println(jsonArray.toString(2));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
