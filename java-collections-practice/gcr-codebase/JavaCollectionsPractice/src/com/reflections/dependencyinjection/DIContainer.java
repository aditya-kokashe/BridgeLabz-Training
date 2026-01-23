package com.reflections.dependencyinjection;

import java.lang.reflect.Field;

public class DIContainer {
    public static void main(String[] args) throws Exception {
        Client client = new Client();

        for (Field f : Client.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                f.set(client, f.getType().getDeclaredConstructor().newInstance());
            }
        }

        client.execute();
    }
}
