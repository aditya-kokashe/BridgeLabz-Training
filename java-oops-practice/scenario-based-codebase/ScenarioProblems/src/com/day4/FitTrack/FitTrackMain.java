package com.day4.FitTrack;

public class FitTrackMain {
    public static void main(String[] args) {

        UserProfile user = new UserProfile("Aditya", 21, 72, "Lose Fat");
        user.displayProfile();
        double dailyTarget = 600;
        
        //Cardio work out
        Workout w1 = new CardioWorkout(40);  
        System.out.println("\n+----------------------------+");
        w1.startWorkout();

        double calorie1 = w1.calculateCalories(user.getWeight());
        w1.stopWorkout();
        double progress1 = dailyTarget - calorie1;   // OPERATOR USE
        System.out.println("Calories Burned: " + calorie1);
        System.out.println("Remaining Target: " + progress1);

        
        System.out.println("\n+----------------------------+");
        //Strength work out
        Workout w2 = new StrengthWorkout(10); 
        w2.startWorkout();
        
        double calorie2 = w2.calculateCalories(user.getWeight());
        w2.stopWorkout();
        double progress2 = dailyTarget - calorie2;   // OPERATOR USE
        System.out.println("Calories Burned: " + calorie2);
        System.out.println("Remaining Target: " + progress2);
    }
}
