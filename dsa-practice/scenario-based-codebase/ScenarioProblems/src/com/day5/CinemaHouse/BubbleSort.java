package com.day5.CinemaHouse;

public class BubbleSort {

    public static void sort(MovieShow[] shows) {
        int n = shows.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (shows[j].time > shows[j + 1].time) {
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                }
            }
        }
    }
}
