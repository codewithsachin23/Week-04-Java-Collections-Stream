package day02.collectinontesting.listinterface;

import org.day02.problemstatement.collectinos.listinterface.Nthelementfromtheend.NthElementFromTheEnd;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthElementTest {

    @Test
    void elementTest(){
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        int n=2;
        String expected="D";
        assertEquals(expected,NthElementFromTheEnd.findElement(list,2));
    }
}
