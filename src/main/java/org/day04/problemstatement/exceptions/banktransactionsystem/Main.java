package org.day04.problemstatement.exceptions.banktransactionsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a Amount");
            double amount=sc.nextDouble();
            BankTransactionSystem.withdraw(amount);
            System.out.println("Withdrawal successful, new balance: "+BankTransactionSystem.balance);


        }catch (InsufficientBalanceException e){
            System.out.println("Insufficient balance! "+e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Invalid amount! "+e.getMessage());
        }
    }

}
