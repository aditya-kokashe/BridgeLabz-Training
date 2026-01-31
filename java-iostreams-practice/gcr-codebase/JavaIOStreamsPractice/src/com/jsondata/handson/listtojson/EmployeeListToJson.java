package com.jsondata.handson.listtojson;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class EmployeeListToJson {

    public static void main(String[] args) {

        try {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(1, "Punit"));
            employees.add(new Employee(2, "Rahul"));

            JSONArray jsonArray = new JSONArray();

            for (Employee e : employees) {
                JSONObject obj = new JSONObject();
                obj.put("id", e.getId());
                obj.put("name", e.getName());

                jsonArray.put(obj);
            }

            System.out.println(jsonArray.toString(2));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
