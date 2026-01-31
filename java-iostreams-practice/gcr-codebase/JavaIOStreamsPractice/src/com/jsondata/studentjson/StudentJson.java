package com.jsondata.studentjson;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class StudentJson {

    public static void main(String[] args) {

        try {
            JSONObject student = new JSONObject();

            student.put("name", "Aditya");
            student.put("age", 22);

            JSONArray subjects = new JSONArray();
            subjects.put("Maths");
            subjects.put("Computer Science");
            subjects.put("AI");

            student.put("subjects", subjects);

            System.out.println(student.toString(2));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
