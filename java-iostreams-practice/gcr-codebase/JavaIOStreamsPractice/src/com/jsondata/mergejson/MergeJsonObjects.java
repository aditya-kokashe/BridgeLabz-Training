package com.jsondata.mergejson;

import org.json.JSONObject;
import java.util.Iterator;
import org.json.JSONException;

public class MergeJsonObjects {

    public static void main(String[] args) {

        try {
            // First JSON object
            JSONObject json1 = new JSONObject();
            json1.put("name", "Mohan");
            json1.put("age", 22);

            // Second JSON object
            JSONObject json2 = new JSONObject();
            json2.put("email", "mohan@gmail.com");
            json2.put("city", "Gwalior");

            // Merge json2 into json1
            Iterator<String> keys = json2.keys();

            while (keys.hasNext()) {
                String key = keys.next();
                json1.put(key, json2.get(key));
            }


            // Final merged JSON
            System.out.println(json1.toString(2));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
