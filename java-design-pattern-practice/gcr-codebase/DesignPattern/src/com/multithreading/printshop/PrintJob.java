package com.multithreading.printshop;

public class PrintJob implements Runnable {
    private String jobName;
    private int pages;
    private String priorityLabel;

    public PrintJob(String jobName, int pages, String priorityLabel) {
        this.jobName = jobName;
        this.pages = pages;
        this.priorityLabel = priorityLabel;
    }

    @Override
    public void run() {
        for (int i = 1; i <= pages; i++) {
            System.out.println("[" + priorityLabel + "] Printing " +
                    jobName + " - Page " + i + " of " + pages);
            try {
                Thread.sleep(100); // 100ms per page
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
