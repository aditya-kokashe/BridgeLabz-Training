package com.day9.BirdSanctuary;

public abstract class Bird {
    protected String id;
    protected String name;
    protected String species;

    public Bird(String id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public abstract void eat();

    public String getId() { return id; }
}
