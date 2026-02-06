package com.multithreading.downloadmanager.usingthread;

import java.util.Random;

class FileDownloader extends Thread {
    private String fileName;
    private Random random = new Random();

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 100; i += 25) {
                System.out.println("[" + getName() + "] Downloading " + fileName + ": " + i + "%");
                Thread.sleep(500 + random.nextInt(500));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}