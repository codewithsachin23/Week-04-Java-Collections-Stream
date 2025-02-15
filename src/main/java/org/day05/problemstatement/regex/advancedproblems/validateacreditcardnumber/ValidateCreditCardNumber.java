package org.day05.problemstatement.regex.advancedproblems.validateacreditcardnumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Credit Card Number");
        String cardNumber=sc.nextLine();
        String regex="^(4\\d{15}|5\\d{15})$";
        if (Pattern.matches(regex,cardNumber)){
            if (cardNumber.charAt(0)=='4'){
                System.out.println("Visa card");
            }else{
                System.out.println("MasterCard");
            }
        }else{
            System.out.println("Invalid!");
        }

    }
}
