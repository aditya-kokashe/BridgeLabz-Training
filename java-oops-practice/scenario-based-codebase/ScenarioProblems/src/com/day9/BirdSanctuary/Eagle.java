package com.day9.BirdSanctuary;

public class Eagle extends Bird implements Flyable {
    public Eagle(String id, String name) {
        super(id, name, "Eagle");
    }
    public void eat() { System.out.println(name + " eats meat."); }
    public void fly() { System.out.println(name + " soars high."); }
}
