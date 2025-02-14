package org.day04.problemstatement.exceptions.customexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            CustomException.validateAge(age);


        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
