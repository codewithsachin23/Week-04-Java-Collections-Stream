package day02.collectinontesting.mapinterface;



import org.day02.problemstatement.collectinos.mapinterface.FindTheKeyWithTheHighestValue;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FindTheKeyWithTheHighestValueTest {

    @Test
    void testKeyWithTheHighestValue() {
        // Create a test map
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("A", 10);
        testMap.put("B", 20);
        testMap.put("C", 15);

        // Call the method and check the result
        String result = FindTheKeyWithTheHighestValue.keyWithTheHighestValue(testMap);

        // Assert the result
        assertEquals("B", result, "The key with the highest value should be 'B'.");
    }

    @Test
    void testKeyWithTheHighestValueEmptyMap() {
        // Create an empty map
        Map<String, Integer> testMap = new HashMap<>();

        // Call the method and check the result
        String result = FindTheKeyWithTheHighestValue.keyWithTheHighestValue(testMap);

        // Assert the result
        assertEquals("", result, "The result should be an empty string for an empty map.");
    }

    @Test
    void testKeyWithTheHighestValueEqualValues() {
        // Create a map with equal values
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("A", 10);
        testMap.put("B", 10);

        // Call the method and check the result
        String result = FindTheKeyWithTheHighestValue.keyWithTheHighestValue(testMap);

        // Assert the result (tie-breaking behavior depends on iteration order)
        assertTrue(result.equals("A") || result.equals("B"), "The result should be one of the keys with the highest value.");
    }
}
