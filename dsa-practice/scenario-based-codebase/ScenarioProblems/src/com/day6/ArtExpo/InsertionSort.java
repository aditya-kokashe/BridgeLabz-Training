package com.day6.ArtExpo;

public class InsertionSort {

    public static void sort(Artist[] artists) {

        for (int i = 1; i < artists.length; i++) {
            Artist key = artists[i];
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
                artists[j + 1] = artists[j];
                j--;
            }

            artists[j + 1] = key;
        }
    }
}
