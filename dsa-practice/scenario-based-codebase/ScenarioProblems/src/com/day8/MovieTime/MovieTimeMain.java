package com.day8.MovieTime;

public class MovieTimeMain {

    public static void main(String[] args) {

        MovieTime mt = new MovieTime(10);

        mt.addShow(new Show("Javan", 2024));
        mt.addShow(new Show("Demon Slayer", 2025));
        mt.addShow(new Show("Interstellar", 2000));
        mt.addShow(new Show("Dune", 1700));

        System.out.println("Sorted Show Listings:\n");
        mt.displayShows();
    }
}