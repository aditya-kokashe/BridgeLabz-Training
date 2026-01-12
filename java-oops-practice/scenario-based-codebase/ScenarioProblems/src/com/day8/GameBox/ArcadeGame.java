package com.day8.GameBox;

public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price) {
        super(title, "Arcade", price);
    }

    public void download() {
        System.out.println("Arcade game downloaded: " + title);
    }

    public void playDemo() {
        System.out.println("Playing fast-paced arcade demo");
    }
}