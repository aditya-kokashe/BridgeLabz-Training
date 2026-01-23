package com.reflections.getclassinformation;

import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) throws Exception {
        String className = "java.util.ArrayList"; // you can change this
        Class<?> cls = Class.forName(className);

        System.out.println("Class Name: " + cls.getName());

        System.out.println("\nMethods:");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        System.out.println("\nFields:");
        for (Field f : cls.getDeclaredFields()) {
            System.out.println(f.getName());
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> c : cls.getDeclaredConstructors()) {
            System.out.println(c);
        }
    }
}
