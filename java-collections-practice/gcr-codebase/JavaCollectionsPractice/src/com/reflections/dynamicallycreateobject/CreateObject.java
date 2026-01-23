package com.reflections.dynamicallycreateobject;

public class CreateObject {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName(
            "com.reflections.dynamicallycreateobject.Student"
        );

        Object obj = cls.getDeclaredConstructor().newInstance();
    }
}
