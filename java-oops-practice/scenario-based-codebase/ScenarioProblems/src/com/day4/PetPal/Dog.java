package com.day4.PetPal;

public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
        this.type = "Dog";
    }

    @Override
    public void feed() {
        changeHunger(-20);
        System.out.println(name + " is eating bones");
    }

    @Override
    public void play() {
        changeEnergy(-15);
        changeHunger(+10);
        System.out.println(name + " is playing fetch");
    }

    @Override
    public void sleep() {
        changeEnergy(+25);
        System.out.println(name + " is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("\nWoof");
    }
}
