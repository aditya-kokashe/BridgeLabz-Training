package com.day4.FitTrack;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        this.type = "Strength";
        this.duration = duration;
    }

    @Override
    public double calculateCalories(double weight) {
        caloriesBurned = duration * 6 * weight / 60;
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println("Starting Strength Training");
    }

    @Override
    public void stopWorkout() {
        logWorkout();
        System.out.println("Strength Workout Completed");
    }
}
