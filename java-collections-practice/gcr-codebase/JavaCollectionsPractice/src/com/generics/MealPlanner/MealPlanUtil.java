package com.generics.MealPlanner;

public class MealPlanUtil {

    public static <T extends MealPlan> Meal<T> generateMealPlan(
            String userName, T mealPlan) {

        // Validation can be extended
        if (mealPlan == null) {
            throw new IllegalArgumentException("Invalid meal plan");
        }

        return new Meal<>(userName, mealPlan);
    }
}
