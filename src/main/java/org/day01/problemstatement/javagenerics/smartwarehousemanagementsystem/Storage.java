package org.day01.problemstatement.javagenerics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    List<T> item;
    public Storage (){
        this.item=new ArrayList<>();
    }

    public void addItem(T items){
        item.add(items);
    }

    public List<T> getItem(){
        return item;
    }


    // Method to retrieve an item from storage by index
    public T getItem(int index) {
        if (index >= 0 && index < item.size()) {
            return item.get(index);
        }
        throw new IndexOutOfBoundsException("Invalid index.");
    }
    public void displayItems(List<? extends WarehouseItem> item) {
        for (WarehouseItem items : item) {
            System.out.println(items.getName()+" "+items.getPrize());
        }
    }

}
