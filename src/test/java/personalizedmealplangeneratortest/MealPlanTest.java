package personalizedmealplangeneratortest;

import org.day01.problemstatement.javagenerics.personalizedmealplangenerator.HighProteinMeal;
import org.day01.problemstatement.javagenerics.personalizedmealplangenerator.KetoMeal;
import org.day01.problemstatement.javagenerics.personalizedmealplangenerator.VeganMeal;
import org.day01.problemstatement.javagenerics.personalizedmealplangenerator.VegetarianMeal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MealPlanTest {

    @Test
    void testVegetarianMeal() {
        VegetarianMeal vegetarianMeal = new VegetarianMeal("Salad");
        assertEquals("Salad", vegetarianMeal.getMealName());
    }

    @Test
    void testVeganMeal() {
        VeganMeal veganMeal = new VeganMeal("Fruit Bowl");
        assertEquals("Fruit Bowl", veganMeal.getMealName());
    }

    @Test
    void testKetoMeal() {
        KetoMeal ketoMeal = new KetoMeal("Egg & Bacon");
        assertEquals("Egg & Bacon", ketoMeal.getMealName());
    }

    @Test
    void testHighProteinMeal() {
        HighProteinMeal highProteinMeal = new HighProteinMeal("Grilled Chicken");
        assertEquals("Grilled Chicken", highProteinMeal.getMealName());
    }

    @Test
    void testMealDisplay() {
        VegetarianMeal vegetarianMeal = new VegetarianMeal("Salad");
        assertDoesNotThrow(vegetarianMeal::displayMeal);

        VeganMeal veganMeal = new VeganMeal("Veggie Soup");
        assertDoesNotThrow(veganMeal::displayMeal);

        KetoMeal ketoMeal = new KetoMeal("Chicken Salad");
        assertDoesNotThrow(ketoMeal::displayMeal);

        HighProteinMeal highProteinMeal = new HighProteinMeal("Omelet");
        assertDoesNotThrow(highProteinMeal::displayMeal);
    }
}
