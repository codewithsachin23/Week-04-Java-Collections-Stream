package org.day04.problemstatement.exceptions.exceptionpropagation;

import java.util.Scanner;

public class ThrowVsThrows {
    //method for calculating a interest rate
    public static double calculateInterest(double amount, double rate, int years)throws IllegalArgumentException{
        if (amount<0||rate<0){
            throw new IllegalArgumentException("Amount and rate must be positive.");
        }
        return amount*rate*years/100;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter amount");
            double amount=sc.nextDouble();
            System.out.println("Enter rate");
            double rate=sc.nextDouble();
            System.out.println("Enter year");
            int year=sc.nextInt();

            System.out.println("total interest "+calculateInterest(amount,rate,year));

        }catch (IllegalArgumentException e){
            System.out.println("Invalid!"+e.getMessage());
        }
    }
}
