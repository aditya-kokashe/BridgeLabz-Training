package com.reflections.loggingproxy;

import java.lang.reflect.*;

public class LoggingProxy {
    public static void main(String[] args) {
        Greeting target = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(),
            new Class[]{Greeting.class},
            (Object p, Method m, Object[] a) -> {
                System.out.println("Calling method: " + m.getName());
                return m.invoke(target, a);
            }
        );

        proxy.sayHello();
    }
}
