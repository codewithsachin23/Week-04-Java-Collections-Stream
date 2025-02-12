package day02.collectinontesting.listinterface;

import org.day02.problemstatement.collectinos.listinterface.removeduplicates.RemoveDuplicates;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateTest {
    @Test
    void removeDuplicateTest(){
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> expected=new ArrayList<>();
        expected.add(3);
        expected.add(1);
        expected.add(2);
        expected.add(4);
        assertEquals(expected,RemoveDuplicates.removeDuplicates(list));

    }
}
