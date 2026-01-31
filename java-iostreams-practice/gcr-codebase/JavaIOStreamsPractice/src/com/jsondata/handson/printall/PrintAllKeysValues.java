package com.jsondata.handson.printall;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import org.json.JSONObject;
import org.json.JSONException;

public class PrintAllKeysValues {

    public static void main(String[] args) {

        try {
            String path = "src/com/jsondata/handson/printall/data.json";
            String content = new String(Files.readAllBytes(Paths.get(path)));

            JSONObject json = new JSONObject(content);

            Iterator<String> keys = json.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Object value = json.get(key);

                System.out.println(key + " : " + value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
