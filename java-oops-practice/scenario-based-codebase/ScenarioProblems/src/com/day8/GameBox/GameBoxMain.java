package com.day8.GameBox;

public class GameBoxMain {

    public static void main(String[] args) {

        Game game1 = new ArcadeGame("Speed Run", 499);
        Game game2 = new StrategyGame("War Planner", 799);

        game1.download();
        game1.playDemo();

        System.out.println("Discounted price: " + game2.applyDiscount(20));
    }
}