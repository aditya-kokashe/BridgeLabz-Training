package com.jsondata.handson.mergefiles;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import org.json.JSONObject;

public class MergeJsonFiles {

    public static void main(String[] args) {

        try {
            String path1 = "src/com/jsondata/handson/mergefiles/file1.json";
            String path2 = "src/com/jsondata/handson/mergefiles/file2.json";

            String content1 = new String(Files.readAllBytes(Paths.get(path1)));
            String content2 = new String(Files.readAllBytes(Paths.get(path2)));

            JSONObject json1 = new JSONObject(content1);
            JSONObject json2 = new JSONObject(content2);

            // Merge json2 into json1
            Iterator<String> keys = json2.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                json1.put(key, json2.get(key));
            }

            // Final merged JSON
            System.out.println(json1.toString(2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
