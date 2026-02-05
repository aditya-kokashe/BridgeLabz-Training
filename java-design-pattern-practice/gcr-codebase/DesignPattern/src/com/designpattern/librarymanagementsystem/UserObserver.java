package com.designpattern.librarymanagementsystem;

public class UserObserver implements Observer {

    private String name;

    public UserObserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("Notification to " + name + ": " + message);
    }
}
