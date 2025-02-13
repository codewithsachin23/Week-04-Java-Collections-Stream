package day02.collectinontesting.mapinterface;

import org.day02.problemstatement.collectinos.mapinterface.InvertAMap;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class InvertAMapTest {

    @Test
    void testInvertMap() {
        // Create a test map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Call the method to invert the map
        Map<Integer, List<String>> invertedMap = InvertAMap.invertMap(originalMap);

        // Prepare the expected result
        Map<Integer, List<String>> expectedMap = new HashMap<>();
        expectedMap.put(1, Arrays.asList("A", "C"));
        expectedMap.put(2, Collections.singletonList("B"));

        // Assert the result
        assertEquals(expectedMap, invertedMap, "The inverted map should group keys by their values.");
    }
}
