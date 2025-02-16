package day06.annotation.practiceproblems;


import org.day06.problemstatement.annotation.practiceproblems.customannotations.advancedlevel.rolebasedaccesss.RoleAllowed;
import org.day06.problemstatement.annotation.practiceproblems.customannotations.advancedlevel.rolebasedaccesss.SecureOperations;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;


public class RoleBasedAccessControlTest {
    @Test
    public void testAdminAccessAllowed() throws Exception {
        SecureOperations operations = new SecureOperations();
        Method method = SecureOperations.class.getDeclaredMethod("performAdminTask");

        RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
        assertNotNull(annotation); // Ensure annotation is present
        assertEquals("ADMIN", annotation.value()); // Check role requirement
    }

    @Test
    public void testUserAccessDenied() throws Exception {
        SecureOperations operations = new SecureOperations();
        Method method = SecureOperations.class.getDeclaredMethod("performAdminTask");
        RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);

        assertNotNull(annotation);
        assertNotEquals("USER", annotation.value()); // Ensure USER role is denied
    }
}
