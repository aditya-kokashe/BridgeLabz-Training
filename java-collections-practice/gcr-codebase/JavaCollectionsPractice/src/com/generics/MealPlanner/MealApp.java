package com.generics.MealPlanner;

public class MealApp {

    public static void main(String[] args) {

        Meal<VegetarianMeal> m1 =MealPlanUtil.generateMealPlan("Aman", new VegetarianMeal());
        Meal<VeganMeal> m2 =MealPlanUtil.generateMealPlan("Riya", new VeganMeal());
        Meal<KetoMeal> m3 =MealPlanUtil.generateMealPlan("Arjun", new KetoMeal());
        Meal<HighProteinMeal> m4 =MealPlanUtil.generateMealPlan("Meera", new HighProteinMeal());

        System.out.println("Personalized Meal Plans:");
        System.out.println();
        System.out.println(m1.getDetails());
        System.out.println(m2.getDetails());
        System.out.println(m3.getDetails());
        System.out.println(m4.getDetails());
    }
}
