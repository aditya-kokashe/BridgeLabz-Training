package com.multithreading.restaurantprocessingsystem;

public class Chef extends Thread {
    private String dish;
    private int totalTime;

    public Chef(String name, String dish, int totalTime) {
        super(name);
        this.dish = dish;
        this.totalTime = totalTime;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dish);
        try {
            int step = totalTime / 4;
            for (int i = 25; i <= 100; i += 25) {
                Thread.sleep(step);
                System.out.println(getName() + " preparing " + dish + ": " + i + "% complete");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
