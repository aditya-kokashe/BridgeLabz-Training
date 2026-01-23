package com.reflections.dyanamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicInvoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations obj = new MathOperations();

        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = sc.next();

        try {
            Method method = MathOperations.class.getMethod(
                    methodName, int.class, int.class);

            Object result = method.invoke(obj, 10, 5);
            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found. Please enter a valid method name.");
            System.out.println("Available methods: add, subtract, multiply");

        } catch (Exception e) {
            System.out.println("Error while invoking method: " + e.getMessage());
        }

        sc.close();
    }
}
