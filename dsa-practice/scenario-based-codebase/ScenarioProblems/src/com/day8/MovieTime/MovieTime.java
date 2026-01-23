package com.day8.MovieTime;

public class MovieTime {

    private Show[] shows;
    private int size;

    public MovieTime(int capacity) {
        shows = new Show[capacity];
        size = 0;
    }

    // Insert show in sorted order (Insertion Sort)
    public void addShow(Show show) {

        int i = size - 1;
        while (i >= 0 && shows[i].showTime > show.showTime) {
            shows[i + 1] = shows[i];
            i--;
        }

        shows[i + 1] = show;
        size++;
    }

    public void displayShows() {
        for (int i = 0; i < size; i++)
            System.out.println(shows[i]);
    }
}