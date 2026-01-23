package com.day8.GamerZone;

public class GameZoneMain {

    public static void main(String[] args) {

        Player[] players = {
                new Player("Mohan", 2400),
                new Player("Kartik", 3100),
                new Player("Bhargav", 1800),
                new Player("Prateek", 2900)
        };

        GameZone gz = new GameZone();
        gz.quickSort(players, 0, players.length - 1);

        System.out.println("Leaderboard:\n");
        for (Player p : players)
            System.out.println(p);
    }
}