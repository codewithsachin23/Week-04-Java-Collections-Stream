package org.day04.problemstatement.exceptions.uncheckedexception;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter number 1: ");
            int number1=input.nextInt();
            System.out.println("Enter number2: ");
            int number2=input.nextInt();
            System.out.println("Output is "+number1/number2);

        }catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed"+e.getMessage());

        }catch (InputMismatchException e){
            System.out.println("Please enter numeric values only"+e.getMessage());
        }
    }
}
