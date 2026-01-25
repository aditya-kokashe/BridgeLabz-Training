package com.annotations.cacheresult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheResultMain {

    private static final Map<String, Object> cache = new HashMap<>();

    public static void main(String[] args) throws Exception {

        MathService service = new MathService();
        Method method = service.getClass().getMethod("square", int.class);

        System.out.println(invokeWithCache(service, method, 5));
        System.out.println(invokeWithCache(service, method, 5)); // Cached
        System.out.println(invokeWithCache(service, method, 6));
    }

    private static Object invokeWithCache(
            Object obj, Method method, Object arg) throws Exception {

        String key = method.getName() + "_" + arg;

        if (method.isAnnotationPresent(CacheResult.class)) {

            if (cache.containsKey(key)) {
                System.out.println("Returning cached result");
                return cache.get(key);
            }

            Object result = method.invoke(obj, arg);
            cache.put(key, result);
            return result;
        }

        return method.invoke(obj, arg);
    }
}