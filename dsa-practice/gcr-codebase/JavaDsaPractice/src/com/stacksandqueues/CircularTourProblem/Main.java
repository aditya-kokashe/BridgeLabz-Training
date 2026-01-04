package com.stacksandqueues.CircularTourProblem;

public class Main{
    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startPoint = CircularTour.findStart(petrol, distance);

        if (startPoint != -1)
            System.out.println("Start from petrol pump: " + startPoint);
        else
            System.out.println("No possible circular tour");
    }
}
