package day06.annotation.excercise;

import org.day06.problemstatement.annotation.excercise.useddeprecated.LegacyAPI;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LegacyAPITest {
    // test method
    @Test
    public void testOldFeature() {
        LegacyAPI legacyAPI = new LegacyAPI();
        legacyAPI.oldFeature();
        assertTrue(true);
    }

    // test method
    @Test
    public void testNewFeature() {
        LegacyAPI legacyAPI = new LegacyAPI();
        legacyAPI.newFeature();
        assertTrue(true);
    }
}

