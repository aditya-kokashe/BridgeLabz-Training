package com.day4.FitTrack;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        this.type = "Cardio";
        this.duration = duration;
    }

    @Override
    public double calculateCalories(double weight) {
        caloriesBurned = duration * 8 * weight / 60;   // formula
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println("Starting Cardio Workout");
    }

    @Override
    public void stopWorkout() {
        logWorkout();
        System.out.println("Cardio Workout Completed");
    }
}
