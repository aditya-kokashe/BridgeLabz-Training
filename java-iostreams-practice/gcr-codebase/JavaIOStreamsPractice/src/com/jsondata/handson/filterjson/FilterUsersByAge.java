package com.jsondata.handson.filterjson;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class FilterUsersByAge {

    public static void main(String[] args) {

        try {
            String path = "src/com/jsondata/handson/filterjson/users.json";
            String content = new String(Files.readAllBytes(Paths.get(path)));

            JSONArray users = new JSONArray(content);

            for (int i = 0; i < users.length(); i++) {
                JSONObject user = users.getJSONObject(i);

                int age = user.getInt("age");

                if (age > 25) {
                    System.out.println(user.toString(2));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
