package com.day3.CampusConnect;

public class Faculty extends Person {

    public Faculty(String name, String email, String id) {
        super(name, email, id);
    }

    @Override
    public void printDetails() {
        System.out.println("Faculty Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("ID: " + getId());
        System.out.println();
    }
}
