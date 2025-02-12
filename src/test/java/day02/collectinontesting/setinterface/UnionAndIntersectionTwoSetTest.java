package day02.collectinontesting.setinterface;
import org.day02.problemstatement.collectinos.setinterface.UnionAndIntersectionTwoSet;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UnionAndIntersectionTwoSetTest {
    @Test
    void testUnion() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedUnion = new HashSet<>();
        expectedUnion.add(1);
        expectedUnion.add(2);
        expectedUnion.add(3);
        expectedUnion.add(4);
        expectedUnion.add(5);
        UnionAndIntersectionTwoSet.unionAndIntersection(set1, set2);


        assertEquals(expectedUnion, "Union should contain all elements from both sets");
    }
}
