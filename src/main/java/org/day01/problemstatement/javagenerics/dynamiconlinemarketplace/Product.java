package org.day01.problemstatement.javagenerics.dynamiconlinemarketplace;

import java.util.Calendar;

public class Product <T extends OnlineMarketplace>{
    private String name;
    private int prize;
    private T category;
   public Product(String name,int prize, T category){
       this.name=name;
       this.prize=prize;
       this.category= category;
   }
   public String getName(){
       return name;
   } public int getPrize(){
       return prize;
   } public T getCategory(){
       return category;
   }
   public int setPrize(double newPrize){
       return prize=(int)newPrize;
   }

}
