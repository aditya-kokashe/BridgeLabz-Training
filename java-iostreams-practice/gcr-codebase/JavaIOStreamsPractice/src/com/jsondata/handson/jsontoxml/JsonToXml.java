package com.jsondata.handson.jsontoxml;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXml {

    public static void main(String[] args) {

        try {
            String path = "src/com/jsondata/handson/jsontoxml/data.json";
            String jsonContent = new String(Files.readAllBytes(Paths.get(path)));

            JSONObject jsonObject = new JSONObject(jsonContent);

            // Convert JSON to XML
            String xml = XML.toString(jsonObject);

            System.out.println(xml);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
