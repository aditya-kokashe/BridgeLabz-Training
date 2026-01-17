package com.day5.CinemaHouse;

public class CinemaHouseMain {

    public static void main(String[] args) {

        // Manual entry of show times 
        MovieShow[] shows = {
            new MovieShow(1800),
            new MovieShow(1000),
            new MovieShow(2130),
            new MovieShow(1430),
            new MovieShow(1200)
        };

        System.out.println("Before Sorting:");
        for (MovieShow show : shows) {
            System.out.print(show.time + " ");
        }

        BubbleSort.sort(shows);

        System.out.println("\nAfter Sorting:");
        for (MovieShow show : shows) {
            System.out.print(show.time + " ");
        }
    }
}
