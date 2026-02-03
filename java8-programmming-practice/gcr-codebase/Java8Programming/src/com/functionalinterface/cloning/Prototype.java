package com.functionalinterface.cloning;

public class Prototype implements Cloneable {

    private int id;
    private String name;

    public Prototype(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    @Override
    public String toString() {
        return "Prototype \n"+ id + " : " + name;
    }
}
