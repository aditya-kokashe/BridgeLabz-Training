package com.day8.MovieTime;

public class Show {
    String movieName;
    //24-hour format
    int showTime; 

    public Show(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return movieName + " ( Time: " + showTime+" )";
    }
}