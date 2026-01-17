package com.day6.ArtExpo;

public class ArtExpoMain {

    public static void main(String[] args) {

        // Artists registering throughout the day
        Artist[] artists = {
            new Artist("Aarav", 120),
            new Artist("Meera", 45),
            new Artist("Kabir", 200),
            new Artist("Riya", 90),
            new Artist("Vikram", 150)
        };

        System.out.println("Before Sorting:");
        for (Artist a : artists) {
            System.out.println(a.name + " -> " + a.registrationTime);
        }

        InsertionSort.sort(artists);

        System.out.println("\nAfter Sorting:");
        for (Artist a : artists) {
            System.out.println(a.name + " -> " + a.registrationTime);
        }
    }
}
