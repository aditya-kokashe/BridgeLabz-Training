package com.annotations.importantmethod;

import java.lang.reflect.Method;

public class ImportantMethodMain {

    public static void main(String[] args) {

        Method[] methods = ServiceTasks.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod imp = method.getAnnotation(ImportantMethod.class);
                System.out.println(
                    "Method: " + method.getName() +
                    ", Level: " + imp.level()
                );
            }
        }
    }
}