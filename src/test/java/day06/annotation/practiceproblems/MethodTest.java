package day06.annotation.practiceproblems;



import org.day06.problemstatement.annotation.practiceproblems.customannotations.beginnerlevel.markimportantmethods.ImportantClass;
import org.day06.problemstatement.annotation.practiceproblems.customannotations.beginnerlevel.markimportantmethods.ImportantMethod;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class MethodTest {
    @Test
    public void testCriticalOperationMarkedAsHigh() throws Exception {
        Method method = ImportantClass.class.getDeclaredMethod("criticalOperation");
        ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);

        assertNotNull(annotation); // Ensure annotation is present
        assertEquals("HIGH", annotation.level());
    }

    @Test
    public void testSecondaryOperationMarkedAsMedium() throws Exception {
        Method method = ImportantClass.class.getDeclaredMethod("secondaryOperation");
        ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);

        assertNotNull(annotation);
        assertEquals("MEDIUM", annotation.level());
    }
}
