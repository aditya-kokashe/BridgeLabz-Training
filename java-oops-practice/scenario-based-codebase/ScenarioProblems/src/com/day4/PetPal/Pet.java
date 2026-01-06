package com.day4.PetPal;

import java.util.Random;
public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;
    private int energy;
    private String mood;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(40) + 30;
        this.energy = r.nextInt(40) + 30;
        updateMood();
    }

    public Pet(String name, int age, int hunger, int energy) {
        this.name = name;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        updateMood();
    }

    protected void changeHunger(int value) {
        hunger += value;
        if (hunger < 0) {
        	hunger = 0;
        }
        if (hunger > 100) {
        	hunger = 100;
        }
        updateMood();
    }

    protected void changeEnergy(int value) {
        energy += value;
        if (energy < 0) {
        	energy = 0;
        }
        if (energy > 100) {
        	energy = 100;
        }
        updateMood();
    }

    private void updateMood() {
        if (hunger > 70) {
        	mood = "Hungry";
        }
        else if (energy < 30) {
        	mood = "Tired";
        }
        else {
        	mood = "Happy";
        }
    }

    public String getMood() {
        return mood;
    }

    public abstract void makeSound();
}
