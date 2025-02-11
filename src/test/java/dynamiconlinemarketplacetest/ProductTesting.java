package dynamiconlinemarketplacetest;

import org.day01.problemstatement.javagenerics.dynamiconlinemarketplace.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTesting{

    @Test
    void testApplyDiscount() {
        // Create a BookCategory object
        Books bookCategory = new Books();

        //Create a Product object with initial price
        Product<Books> book = new Product<>("The Great Gatsby", 500, bookCategory);


        ProductCatalog.applyDiscount(book, 10);


        double expectedPrice = 500 - (500.0 * 0.1);
        assertEquals(expectedPrice, book.getPrize(), 0.01);
    }

    @Test
    void testApplyDiscountWithZeroPercentage() {
        //  Create a ClothingCategory object
        Clothing clothingCategory = new Clothing();

        // Create a Product object with initial price
        Product<Clothing> shirt = new Product<>("Formal Shirt", 1000, clothingCategory);

        ProductCatalog.applyDiscount(shirt, 0);


        assertEquals(1000, shirt.getPrize(), 0.01); // No change in price
    }

    @Test
    void testApplyDiscountWith100Percentage() {
        // Create a GadgetCategory object
        Gadgets gadgetCategory = new Gadgets();

       // Create a Product object with initial price
        Product<Gadgets> phone = new Product<>("Smartphone", 20000, gadgetCategory);

        ProductCatalog.applyDiscount(phone, 100);

        assertEquals(0, phone.getPrize(), 0.01); // Fully discounted price
    }
}
