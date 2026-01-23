package com.day7.FitnessTracker;

public class User {
    String name;
    int steps;

    public User(String name, int steps) {
        this.name = name;
        this.steps = steps;
    }

    @Override
    public String toString() {
        return name + " ( Steps: " + steps +" )";
    }
}