package com.functionalinterface.backgroundjob;

public class BackgroundJobMain {

    public static void main(String[] args) {

        Runnable backgroundJob = () -> {
            System.out.println("Background job started");
            System.out.println("Processing data...");
            System.out.println("Background job completed");
        };

        backgroundJob.run();

        System.out.println("Main program execution finished");
    }
}
