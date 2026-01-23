package com.reflections.objecttojson;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Student s = new Student();
        s.id = 1;
        s.name = "Vishakha";
        s.age = 20;

        String json = JsonUtil.toJson(s);
        System.out.println(json);
    }
}
