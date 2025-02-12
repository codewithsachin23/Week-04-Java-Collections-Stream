package day02.collectinontesting.setinterface;
import org.day02.problemstatement.collectinos.setinterface.ConvertASetToSortedList;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ConvertASetSortedListTest {

    @Test
    void testConvertSetToSortedList() {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        List<Integer> expected = Arrays.asList(1, 3, 5, 9);
        List<Integer> actual = ConvertASetToSortedList.convertASetSortedList(set);

        assertEquals(expected, actual, "The list should be sorted in ascending order");
    }

    @Test
    void testEmptySet() {
        Set<Integer> set = new HashSet<>();

        List<Integer> expected = Arrays.asList();
        List<Integer> actual = ConvertASetToSortedList.convertASetSortedList(set);

        assertEquals(expected, actual, "An empty set should result in an empty list");
    }
}