package com.day7.FitnessTracker;

public class FitnessTrackerMain {

    public static void main(String[] args) {

        User[] users = {
                new User("Prem", 8500),
                new User("Sneha", 12000),
                new User("MOhit", 7000),
                new User("Aarya", 9500)
        };

        FitnessTracker ft = new FitnessTracker();
        ft.bubbleSort(users);

        System.out.println("Daily Step Rankings: \n");
        for (User u : users)
            System.out.println(u);
    }
}