package org.day01.problemstatement.javagenerics.personalizedmealplangenerator;

public class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("Keto Meal: " + mealName);
    }
}
