package org.day06.problemstatement.annotation.practiceproblems.customannotations.intermediatelevel.fieldvalidation;

public class AnnotationTest {
    public static void main(String[] args) {
        try {
            User user1 = new User("Pratham"); //Valid username
            System.out.println("User created: " + user1);

            User user2 = new User("Suraj Kumar Patel"); //Exceeds max length
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}