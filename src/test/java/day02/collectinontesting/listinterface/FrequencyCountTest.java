package day02.collectinontesting.listinterface;

import org.day02.problemstatement.collectinos.listinterface.findfrequencyofelements.FindFrequencyOfElements;
import org.junit.jupiter.api.Test;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequencyCountTest {
   @Test
    void frequencyCountTest(){
       List<String>listOfString=new ArrayList<>();
       listOfString.add("apple");
       listOfString.add("banana");
       listOfString.add("apple");
       listOfString.add("orange");

       Map<String,Integer> map=new HashMap<>();
        map.put("apple",2);
        map.put("orange",1);
        map.put("banana",1);

        Map<String,Integer> map1= FindFrequencyOfElements.frequencyCount(listOfString);

        assertEquals(map,map1);
    }
}
