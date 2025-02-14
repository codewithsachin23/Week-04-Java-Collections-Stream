package org.day04.problemstatement.exceptions.banktransactionsystem;

public class BankTransactionSystem{
    static double balance=5000;
    public static void withdraw(double amount)throws InsufficientBalanceException,IllegalArgumentException {
        if (amount>balance) {
            throw new InsufficientBalanceException("Insufficient Balance Exception");
        } else if (amount<0) {
            throw new IllegalArgumentException ("amount is negative");
        }else {
            balance-=amount;

        }

    }

}
