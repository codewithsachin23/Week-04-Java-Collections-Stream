package org.day04.problemstatement.exceptions.multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=null;

        try {
            System.out.println("Enter a size of array");
            int size=sc.nextInt();
            if (size>0){
            arr=new int[size];
            System.out.println("Enter a number");
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }}
            System.out.println("Enter a Index");
            int index= sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index!");

        }catch (NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }
}
