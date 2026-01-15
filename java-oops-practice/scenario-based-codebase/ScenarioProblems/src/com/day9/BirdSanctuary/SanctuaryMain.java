package com.day9.BirdSanctuary;

import java.util.*;
public class SanctuaryMain {

    public static void main(String[] args) {

        Sanctuary sanctuary = new Sanctuary();

        sanctuary.addBird(new Eagle("B101", "Rocky"));
        sanctuary.addBird(new Duck("B102", "Dream"));
        sanctuary.addBird(new Kiwi("B103", "Momo"));

        System.out.println("\nFlying Birds:");
        sanctuary.showFlying();

        System.out.println("\nAll Birds Eating:");
        sanctuary.displayAll();

        sanctuary.deleteById("B102");

        System.out.println("\nAfter Deletion:");
        sanctuary.displayAll();
    }
}
