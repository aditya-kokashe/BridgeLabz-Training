package com.annotations.logexecution;

import java.lang.reflect.Method;

public class LogExecutionMain {

    public static void main(String[] args) throws Exception {

        PerformanceService service = new PerformanceService();
        Method[] methods = service.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();
                method.invoke(service);
                long end = System.nanoTime();

                System.out.println(
                    method.getName() + " executed in " + (end - start) + " ns"
                );
            }
        }
    }
}