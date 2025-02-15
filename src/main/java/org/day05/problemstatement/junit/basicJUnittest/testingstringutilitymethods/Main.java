package org.day05.problemstatement.junit.basicJUnittest.testingstringutilitymethods;

public class Main {
    public static void main(String[] args) {
        String str="sachin";
        System.out.println(StringUtils.reverse(str));
        System.out.println(StringUtils.isPalindrome(str));
        System.out.println(StringUtils.toUpperCase(str));
    }
}
