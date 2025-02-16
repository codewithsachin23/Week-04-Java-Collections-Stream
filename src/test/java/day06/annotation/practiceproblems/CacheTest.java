package day06.annotation.practiceproblems;


import org.day06.problemstatement.annotation.practiceproblems.customannotations.advancedlevel.customcachingsystem.ExpensiveOperations;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class CacheTest {
    @Test
    public void testComputeSquareCaching() {
        ExpensiveOperations operations = new ExpensiveOperations();

        int firstCall = operations.computeSquare(5); // Compute
        int secondCall = operations.computeSquare(5); // Cached
        assertEquals(firstCall, secondCall); // Should be same

        int thirdCall = operations.computeSquare(10); // Compute
        int fourthCall = operations.computeSquare(10); // Cached
        assertEquals(thirdCall, fourthCall); // Should be same
    }
}