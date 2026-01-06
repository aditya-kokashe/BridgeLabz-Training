package com.day4.PetPal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
        this.type = "Cat";
    }

    @Override
    public void feed() {
        changeHunger(-15);
        System.out.println(name + " is eating fish");
    }

    @Override
    public void play() {
        changeEnergy(-10);
        changeHunger(+8);
        System.out.println(name + " is chasing a laser");
    }

    @Override
    public void sleep() {
        changeEnergy(+30);
        System.out.println(name + " is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("\nMeow");
    }
}
