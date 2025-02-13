package day02.collectinontesting.mapinterface;
import org.day02.problemstatement.collectinos.mapinterface.MergeTwoMaps;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoMapsTest {

    @Test
    void testMergeTwoMaps() {
        // Create the first map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        // Create the second map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Expected result after merging
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("A", 1);
        expectedMap.put("B", 5);
        expectedMap.put("C", 4);

        Map<String, Integer> result = MergeTwoMaps.mergeTwoMaps(map1, map2);

        // Assert the result
        assertEquals(expectedMap, result, "The merged map should correctly combine values for common keys.");
    }
}
