package org.day05.problemstatement.regex.validateusername;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a UserName: ");
        String username=scanner.nextLine();
        scanner.close();
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        if (Pattern.matches(regex,username)){
           System.out.println(username+" Valid!");
       }else {
           System.out.println(username+" Invalid!");
       }
    }
}
