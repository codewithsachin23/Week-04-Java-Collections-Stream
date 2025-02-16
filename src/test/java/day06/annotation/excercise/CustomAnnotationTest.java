package day06.annotation.excercise;


import org.day06.problemstatement.annotation.excercise.customannotation.TaskInfo;
import org.day06.problemstatement.annotation.excercise.customannotation.TaskManager;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;
public class CustomAnnotationTest {
    @Test
    public void testTaskInfoAnnotation() throws Exception {
        Method method = TaskManager.class.getMethod("completeTask"); // get method
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class); // get annotation

        assertNotNull(taskInfo); // check not null
        assertEquals("High", taskInfo.priority()); // check priority
        assertEquals("Vivek Sahu", taskInfo.assignedTo()); // check assignedTo
    }
}
