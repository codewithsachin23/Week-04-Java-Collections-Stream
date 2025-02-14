package org.day04.problemstatement.exceptions.nestedtrycatchblock;

import java.util.Scanner;

public class NestedTryCatchBlock {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input array size and elements
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            // Input index and divisor
            System.out.print("Enter the index to access: ");
            int index = sc.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = sc.nextInt();

            // Outer try block for ArrayIndexOutOfBoundsException
            try {
                int element = array[index];

                // Inner try block for ArithmeticException
                try {
                    int result = element / divisor;
                    System.out.println("Result of division: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

            sc.close();
        }
    }
