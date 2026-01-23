package com.day8.GamerZone;

public class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " ( Score: " + score+ " )";
    }
}