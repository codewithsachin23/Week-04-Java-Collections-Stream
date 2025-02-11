package org.day01.problemstatement.javagenerics.dynamiconlinemarketplace;

public class Main {
    public static void main(String[] args) {
        // Create Categories
        Books bookCategory = new Books();
        Clothing clothingCategory = new Clothing();
        Gadgets gadgetCategory = new Gadgets();

        // Create Products
        Product<Books> book = new Product<>("The Great Gatsby", 500, bookCategory);
        Product<Clothing> shirt = new Product<>("Formal Shirt", 1000, clothingCategory);
        Product<Gadgets> phone = new Product<>("Smartphone", 20000, gadgetCategory);

        // Add Products to Catalog
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        // Display Products Before Discount
        System.out.println("Products before discount:");
        for (Product<? extends OnlineMarketplace> product : catalog.getProducts()) {
            System.out.println("Product: "+product.getName()+" Prize: "+product.getPrize());
        }

        // Apply Discounts
        ProductCatalog.applyDiscount(book, 10);
        ProductCatalog.applyDiscount(shirt, 20);
        ProductCatalog.applyDiscount(phone, 15);

        // Display Products After Discount
        System.out.println("Products after discount:");
        for (Product<? extends OnlineMarketplace> product : catalog.getProducts()) {
            System.out.println("Product: "+product.getName()+" Prize: "+product.getPrize());

        }
    }
}
