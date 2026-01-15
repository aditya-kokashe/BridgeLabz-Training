package com.day9.BirdSanctuary;

public class Duck extends Bird implements Flyable, Swimmable {
    public Duck(String id, String name) {
        super(id, name, "Duck");
    }
    public void eat() { System.out.println(name + " eats grains."); }
    public void fly() { System.out.println(name + " flies short distance."); }
    public void swim() { System.out.println(name + " swims gracefully."); }
}
