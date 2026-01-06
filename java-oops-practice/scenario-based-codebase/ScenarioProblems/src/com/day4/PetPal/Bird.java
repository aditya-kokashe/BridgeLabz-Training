package com.day4.PetPal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, age);
        this.type = "Bird";
    }

    @Override
    public void feed() {
        changeHunger(-10);
        System.out.println(name + " is eating seeds");
    }

    @Override
    public void play() {
        changeEnergy(-8);
        changeHunger(+6);
        System.out.println(name + " is flying around");
    }

    @Override
    public void sleep() {
        changeEnergy(+20);
        System.out.println(name + " is resting in nest");
    }

    @Override
    public void makeSound() {
        System.out.println("\nTweak");
    }
}
