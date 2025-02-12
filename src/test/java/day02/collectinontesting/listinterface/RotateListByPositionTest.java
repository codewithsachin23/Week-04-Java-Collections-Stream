package day02.collectinontesting.listinterface;

import org.day02.problemstatement.collectinos.listinterface.rotatelist.RotateListByPosition;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateListByPositionTest {
    @Test
    public void testRotateList() {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2;

        List<Integer> expected = Arrays.asList(40, 50, 10, 20,30);
        assertEquals(expected, RotateListByPosition.rotateList(list, k));


}
}
