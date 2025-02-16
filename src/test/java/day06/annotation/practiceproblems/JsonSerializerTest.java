package day06.annotation.practiceproblems;


import org.day06.problemstatement.annotation.practiceproblems.customannotations.advancedlevel.customserialization.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JsonSerializerTest {
    @Test
    public void testUserToJson() {
        User user = new User("Pratham Raj", "pratamraj116@gmail.com");
        String json = user.toJson();

        assertTrue(json.contains("\"user_name\": \"Pratham Raj\"")); // Check username
        assertTrue(json.contains("\"user_email\": \"prathamraj116@gmail.com\"")); // Check email
    }
}
