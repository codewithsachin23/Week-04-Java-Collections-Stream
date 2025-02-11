package org.day01.problemstatement.javagenerics.personalizedmealplangenerator;

public class MealUtility {
    // Generic method to generate a meal plan
    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generated Meal: " + meal.getMealName());
        meal.displayMeal();
    }
}
