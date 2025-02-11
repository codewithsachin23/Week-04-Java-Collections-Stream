package org.day01.problemstatement.javagenerics.personalizedmealplangenerator;

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        // Creating meal plans for different categories
        Meal<VegetarianMeal> vegetarianPlan = new Meal<>();
        vegetarianPlan.addMeal(new VegetarianMeal("Salad"));
        vegetarianPlan.addMeal(new VegetarianMeal("Rice & Vegetables"));

        Meal<VeganMeal> veganPlan = new Meal<>();
        veganPlan.addMeal(new VeganMeal("Fruit Bowl"));
        veganPlan.addMeal(new VeganMeal("Veggie Soup"));

        Meal<KetoMeal> ketoPlan = new Meal<>();
        ketoPlan.addMeal(new KetoMeal("Egg & Bacon"));
        ketoPlan.addMeal(new KetoMeal("Chicken Salad"));

        Meal<HighProteinMeal> highProteinPlan = new Meal<>();
        highProteinPlan.addMeal(new HighProteinMeal("Grilled Chicken"));
        highProteinPlan.addMeal(new HighProteinMeal("Omelet"));

        // Displaying meal plans
        System.out.println("Vegetarian Meal Plan :");
        vegetarianPlan.displayMeals();

        System.out.println("Vegan Meal Plan :");
        veganPlan.displayMeals();

        System.out.println(" Keto Meal Plan :");
        ketoPlan.displayMeals();

        System.out.println("High-Protein Meal Plan: ");
        highProteinPlan.displayMeals();

        // Generating personalized meals
        System.out.println("Generating Personalized Meals :");
        MealUtility.generateMeal(new VegetarianMeal("Mixed Vegetables"));
        MealUtility.generateMeal(new KetoMeal("Steak"));
        MealUtility.generateMeal(new VeganMeal("Smoothie"));
        MealUtility.generateMeal(new HighProteinMeal("Fish & Rice"));
    }
}
