package com.multithreading.threadmonitorsystem;

import java.time.LocalTime;

public class StateMonitor extends Thread {
    private Thread[] threads;

    public StateMonitor(Thread[] threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            running = false;
            for (Thread t : threads) {
                System.out.println("[Monitor] " + t.getName() +
                        " is in " + t.getState() +
                        " at " + LocalTime.now());
                if (t.getState() != Thread.State.TERMINATED) {
                    running = true;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Summary: All tasks completed");
    }
}
