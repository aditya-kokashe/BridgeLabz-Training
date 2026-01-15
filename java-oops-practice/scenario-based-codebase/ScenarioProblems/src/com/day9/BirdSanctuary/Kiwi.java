package com.day9.BirdSanctuary;

public class Kiwi extends Bird {
    public Kiwi(String id, String name) {
        super(id, name, "Kiwi");
    }
    public void eat() { System.out.println(name + " eats insects."); }
}
