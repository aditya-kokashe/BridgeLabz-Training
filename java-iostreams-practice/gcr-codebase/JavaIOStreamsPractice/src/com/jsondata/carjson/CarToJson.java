package com.jsondata.carjson;

import org.json.JSONObject;
import org.json.JSONException;

public class CarToJson {

    public static void main(String[] args) {

        try {
            Car car = new Car("Tesla", 2024);

            JSONObject carJson = new JSONObject();
            carJson.put("brand", car.getBrand());
            carJson.put("year", car.getYear());

            System.out.println(carJson.toString(2));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
