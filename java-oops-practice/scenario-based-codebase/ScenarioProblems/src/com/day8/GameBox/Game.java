package com.day8.GameBox;

public abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = 0.0;
    }

    public double applyDiscount(double percent) {
        return price - (price * percent / 100); // operator usage
    }
}