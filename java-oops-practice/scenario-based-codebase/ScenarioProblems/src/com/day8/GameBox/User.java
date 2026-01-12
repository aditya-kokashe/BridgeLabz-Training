package com.day8.GameBox;

import java.util.ArrayList;
public class User {

    private String name;
    private ArrayList<Game> ownedGames;

    public User(String name) {
        this.name = name;
        ownedGames = new ArrayList<>();
    }

    public void addGame(Game game) {
        ownedGames.add(game);
    }
}