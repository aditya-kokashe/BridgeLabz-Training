package com.day8.GameBox;

public class StrategyGame extends Game {

    public StrategyGame(String title, double price) {
        super(title, "Strategy", price);
    }

    public void download() {
        System.out.println("Strategy game downloaded: " + title);
    }

    public void playDemo() {
        System.out.println("Playing strategic thinking demo");
    }
}