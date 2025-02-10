package org.day01.problemstatement.javagenerics.smartwarehousemanagementsystem;
public  abstract class WarehouseItem {
    private String name;
    private int prize;
    public WarehouseItem(String name,int prize){
        this.name=name;
        this.prize=prize;
    }
    public String getName(){
        return name;
    }
    public int getPrize(){
        return prize;
    }
}
