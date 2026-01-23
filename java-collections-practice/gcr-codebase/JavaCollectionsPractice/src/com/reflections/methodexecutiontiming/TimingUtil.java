package com.reflections.methodexecutiontiming;

import java.lang.reflect.Method;

public class TimingUtil {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        Method method = MathOperations.class.getMethod("add", int.class, int.class);

        long start = System.nanoTime();
        method.invoke(obj, 10, 20);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}
