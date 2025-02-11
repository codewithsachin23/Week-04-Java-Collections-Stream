package org.day01.problemstatement.javagenerics.personalizedmealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    // Add a meal to the plan
    public void addMeal(T meal) {
        meals.add(meal);
    }

    // Display all meals
    public void displayMeals() {
        for (T meal : meals) {
            meal.displayMeal();
        }
    }
}
