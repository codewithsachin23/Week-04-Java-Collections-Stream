package org.day06.problemstatement.annotation.practiceproblems.customannotations.advancedlevel.customserialization;

public class JsonSerializerTest {
    public static void main(String[] args) {
        User user = new User("Pratham Raj", "prathamraj116@gmail.com");
        System.out.println(user.toJson()); //Printing serialized JSON
    }
}
