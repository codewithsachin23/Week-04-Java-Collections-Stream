package smartwarehousemanagementsystemtest;

import org.junit.jupiter.api.*;
import org.day01.problemstatement.javagenerics.smartwarehousemanagementsystem.Electronics;
import org.day01.problemstatement.javagenerics.smartwarehousemanagementsystem.Furniture;
import org.day01.problemstatement.javagenerics.smartwarehousemanagementsystem.Groceries;
import org.day01.problemstatement.javagenerics.smartwarehousemanagementsystem.Storage;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WarehouseTesting {

    @Test
    void electronicsItemTest(){
        //creating a object of electronic class that extend by warehouse
        Storage<Electronics>electronicsStorage=new Storage<>();

        //adding a item
        electronicsStorage.addItem(new Electronics("laptop",50000));
        electronicsStorage.addItem(new Electronics("mobile",50000));

        Electronics firstItem=electronicsStorage.getItem(0);
        assertEquals("laptop",firstItem.getName());
        assertEquals(50000,firstItem.getPrize());

        Electronics secondItem=electronicsStorage.getItem(1);
        assertEquals("mobile",secondItem.getName());
        assertEquals(50000,secondItem.getPrize());

    }


    @Test
    void groceries(){
        Storage<Groceries> groceriesStorage=new Storage<>();


        groceriesStorage.addItem(new Groceries("Milk", 50));
        groceriesStorage.addItem(new Groceries("bread", 25));

        Groceries firstItem=groceriesStorage.getItem(0);
        assertEquals("Milk",firstItem.getName());
        assertEquals(50,firstItem.getPrize());
        Groceries secondItem=groceriesStorage.getItem(1);
        assertEquals("bread",secondItem.getName());
        assertEquals(25,secondItem.getPrize());

    }

    @Test
    void furniture(){
        Storage<Furniture> furnitureStorage=new Storage<>();
        furnitureStorage.addItem(new Furniture("Table", 500));
        furnitureStorage.addItem(new Furniture("chair", 400));

        Furniture firstItem=furnitureStorage.getItem(0);
        assertEquals("Table",firstItem.getName());
        assertEquals(500,firstItem.getPrize());

        Furniture secondItem=furnitureStorage.getItem(1);
        assertEquals("chair",secondItem.getName());
        assertEquals(400,secondItem.getPrize());
    }

}
