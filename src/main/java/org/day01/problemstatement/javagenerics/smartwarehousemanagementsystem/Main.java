package org.day01.problemstatement.javagenerics.smartwarehousemanagementsystem;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();


//electronics item add in warehouse
        electronicsStorage.addItem(new Electronics("laptop", 50000));
        electronicsStorage.addItem(new Electronics("mobile", 25000));
//Groceries item add in warehouse
        groceriesStorage.addItem(new Groceries("Milk", 50));
        groceriesStorage.addItem(new Groceries("bread", 25));
//Furniture item add in warehouse
        furnitureStorage.addItem(new Furniture("Table", 500));
        furnitureStorage.addItem(new Furniture("chair", 400));

        System.out.println("Electronics Item :");
       electronicsStorage.displayItems(electronicsStorage.getItem());
        System.out.println("Groceries Item :");
       groceriesStorage.displayItems(groceriesStorage.getItem());
        System.out.println("Furniture Item :");
       furnitureStorage.displayItems(furnitureStorage.getItem());
    }
}
