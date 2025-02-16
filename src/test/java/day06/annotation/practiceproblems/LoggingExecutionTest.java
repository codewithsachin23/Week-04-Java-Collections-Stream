package day06.annotation.practiceproblems;

import org.day06.problemstatement.annotation.practiceproblems.customannotations.intermediatelevel.loggingmethodexecusion.LogExecutionTime;
import org.day06.problemstatement.annotation.practiceproblems.customannotations.intermediatelevel.loggingmethodexecusion.PerformanceTest;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoggingExecutionTest {
    @Test
    public void testProcessDataExecution() throws Exception {
        PerformanceTest test = new PerformanceTest();
        Method method = PerformanceTest.class.getDeclaredMethod("processData");

        assertTrue(method.isAnnotationPresent(LogExecutionTime.class)); //Checking annotation presence

        long startTime = System.nanoTime();
        method.invoke(test);
        long endTime = System.nanoTime();

        assertTrue((endTime - startTime) > 0); //Checking execution time is recorded
    }

    @Test
    public void testFetchDataExecution() throws Exception {
        PerformanceTest test = new PerformanceTest();
        Method method = PerformanceTest.class.getDeclaredMethod("fetchData");

        assertTrue(method.isAnnotationPresent(LogExecutionTime.class)); //Checking annotation presence

        long startTime = System.nanoTime();
        method.invoke(test);
        long endTime = System.nanoTime();

        assertTrue((endTime - startTime) > 0); //Checking execution time is recorded
    }
}
