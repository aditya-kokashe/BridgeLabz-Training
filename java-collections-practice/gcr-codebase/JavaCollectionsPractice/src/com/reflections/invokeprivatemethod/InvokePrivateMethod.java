package com.reflections.invokeprivatemethod;

import java.lang.reflect.Method;

public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();

        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        Object result = method.invoke(c, 5, 4);
        System.out.println("Result: " + result);
    }
}
