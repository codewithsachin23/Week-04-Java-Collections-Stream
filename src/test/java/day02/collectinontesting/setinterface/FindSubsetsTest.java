package day02.collectinontesting.setinterface;

import org.day02.problemstatement.collectinos.setinterface.FindSubsets;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


public class FindSubsetsTest {


    @Test
    void testSubset() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        assertTrue(FindSubsets.findSubsets(set1, set2), "set1 should be a subset of set2");
    }
}