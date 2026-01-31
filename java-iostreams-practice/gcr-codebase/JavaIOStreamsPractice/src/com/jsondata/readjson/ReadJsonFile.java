package com.jsondata.readjson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class ReadJsonFile {

    public static void main(String[] args) {

        try {
            // Read entire file as String
            String content = new String(
                    Files.readAllBytes(Paths.get("src/com/jsondata/readjson/users.json"))
            );

            // Convert String to JSONArray
            JSONArray users = new JSONArray(content);

            // Extract only name and email
            for (int i = 0; i < users.length(); i++) {
                JSONObject user = users.getJSONObject(i);

                String name = user.getString("name");
                String email = user.getString("email");

                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("------");
            }

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}
