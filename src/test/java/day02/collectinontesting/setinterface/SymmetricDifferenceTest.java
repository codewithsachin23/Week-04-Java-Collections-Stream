package day02.collectinontesting.setinterface;


import org.day02.problemstatement.collectinos.setinterface.SymmetricDifference;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {

    @Test
    void testSymmetricDifferenceWithOverlap() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedSymmetricDifference = new HashSet<>();
        expectedSymmetricDifference.add(1);
        expectedSymmetricDifference.add(2);
        expectedSymmetricDifference.add(4);
        expectedSymmetricDifference.add(5);

        assertEquals(expectedSymmetricDifference, SymmetricDifference.symmetricDifference(set1, set2), "Symmetric difference should contain elements only in one set, not both");
    }

    @Test
    void testSymmetricDifferenceWithNoOverlap() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);

        Set<Integer> expectedSymmetricDifference = new HashSet<>();
        expectedSymmetricDifference.add(1);
        expectedSymmetricDifference.add(2);
        expectedSymmetricDifference.add(3);
        expectedSymmetricDifference.add(4);

        assertEquals(expectedSymmetricDifference, SymmetricDifference.symmetricDifference(set1, set2), "Symmetric difference of disjoint sets should contain all elements from both sets");
    }

    @Test
    void testSymmetricDifferenceWithIdenticalSets() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        Set<Integer> expectedSymmetricDifference = new HashSet<>();

        assertEquals(expectedSymmetricDifference, SymmetricDifference.symmetricDifference(set1, set2), "Symmetric difference of identical sets should be empty");
    }

    @Test
    void testSymmetricDifferenceWithEmptySet() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();

        Set<Integer> expectedSymmetricDifference = new HashSet<>(set1);

        assertEquals(expectedSymmetricDifference, SymmetricDifference.symmetricDifference(set1, set2), "Symmetric difference with an empty set should be the non-empty set");
    }

    @Test
    void testSymmetricDifferenceWithBothEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> expectedSymmetricDifference = new HashSet<>();

        assertEquals(expectedSymmetricDifference, SymmetricDifference.symmetricDifference(set1, set2), "Symmetric difference of two empty sets should be empty");
    }
}
