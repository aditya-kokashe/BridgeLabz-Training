package com.reflections.accessprivatefield;

import java.lang.reflect.Field;

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person p = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);

        field.set(p, 25);
        System.out.println("Age: " + field.get(p));
    }
}
