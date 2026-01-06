package com.day4.FitTrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // minutes
    protected double caloriesBurned;

    // Restricted internal logs
    protected void logWorkout() {
        System.out.println("Workout logged successfully");
    }

    public abstract double calculateCalories(double weight);

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}
