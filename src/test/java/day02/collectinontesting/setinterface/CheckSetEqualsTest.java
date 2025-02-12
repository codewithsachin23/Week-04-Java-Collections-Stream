package day02.collectinontesting.setinterface;

import org.day02.problemstatement.collectinos.setinterface.CheckifTwoSetsAreEqual;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CheckSetEqualsTest {

    @Test
    void testEqualSets() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        assertTrue(CheckifTwoSetsAreEqual.checkSetEquals(set1, set2), "The sets should be equal");
    }

    @Test
    void testDifferentSizes() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        assertFalse(CheckifTwoSetsAreEqual.checkSetEquals(set1, set2), "The sets should not be equal due to different sizes");
    }
}