package day02.collectinontesting.listinterface;

import org.day02.problemstatement.collectinos.listinterface.reversealist.ReverseAList;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseListTest {

    @Test
    void reverseUsingArrayList(){

        ArrayList<Integer> actual=new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        actual.add(4);
        actual.add(5);

        // Expected output after reversal
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        ReverseAList.reverseList(actual);
        assertEquals(expected,actual);

    }
    @Test
    void reverseUsingLinkedListList(){
        List<Integer> actual = new LinkedList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        actual.add(4);
        actual.add(5);

        // Expected output after reversal
        List<Integer> expected = new LinkedList<>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        ReverseAList.reverseList(actual);
        assertEquals(expected,actual);

    }
}
