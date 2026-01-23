package com.reflections.customobjectmapper;

public class User {
    private int id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "User [id = " + id + ", name = " + name + ", email = " + email + "]";
    }
}
