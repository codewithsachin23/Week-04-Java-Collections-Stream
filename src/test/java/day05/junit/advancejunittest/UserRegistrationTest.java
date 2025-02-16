package day05.junit.advancejunittest;
import static org.junit.jupiter.api.Assertions.*;

import org.day05.problemstatement.junit.advancedJUnit.testinguserregistration.UserRegistration;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {
     private final UserRegistration userRegistration= new UserRegistration();

     @Test
    void testValidUser(){
         assertEquals("User Registered Successfully", userRegistration.registerUser("Vivek Kumar Sahu", "vivek123@gmail.com","Vivek123"));
         assertEquals("User Registered Successfully", userRegistration.registerUser("Pratham Raj", "rjpratham05@gmail.com","Pratham116"));
     }
     @Test
    void testInvaildUser(){
         assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("", "vivek123@gamil.com", "ValidPass1"));
         assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("Raj", "RAJ@GAMIL", "Valid"));
         assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("PATEL", "PATELsuraj@gmail.com", "Valid"));
     }
}
