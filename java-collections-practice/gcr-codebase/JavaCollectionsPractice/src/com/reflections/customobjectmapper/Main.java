package com.reflections.customobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) throws Exception {

        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Mohan");
        data.put("email", "mohanbhargav@example.com");

        User user = ObjectMapperUtil.toObject(User.class, data);

        System.out.println(user);
    }
}
