package com.day8.HomeNest;

public class HomeNestMain {

    public static void main(String[] args) {

        Device light = new Light("L1");
        Device camera = new Camera("C1");

        light.turnOn();
        System.out.println("Energy used: " + light.calculateEnergy(3));

        camera.turnOn();
        camera.reset();
    }
}