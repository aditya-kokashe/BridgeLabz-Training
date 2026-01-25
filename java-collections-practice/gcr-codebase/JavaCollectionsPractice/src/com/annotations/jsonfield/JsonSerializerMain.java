package com.annotations.jsonfield;

import java.lang.reflect.Field;

public class JsonSerializerMain {

    public static void main(String[] args) throws Exception {

        User user = new User("Aakash", 22);
        String json = toJson(user);

        System.out.println(json);
    }

    public static String toJson(Object obj) throws Exception {

        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);

                json.append("\"")
                    .append(annotation.name())
                    .append("\":\"")
                    .append(field.get(obj))
                    .append("\",");
            }
        }

        json.deleteCharAt(json.length() - 1); // remove last comma
        json.append("}");

        return json.toString();
    }
}