package com.reflections.dependencyinjection;

public class Client {
    @Inject
    private Service service;

    public void execute() {
        service.serve();
    }
}
