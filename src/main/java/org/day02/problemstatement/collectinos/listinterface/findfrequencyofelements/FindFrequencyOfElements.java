package org.day02.problemstatement.collectinos.listinterface.findfrequencyofelements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfElements {

    public static Map<String,Integer> frequencyCount(List<String> list){
        Map<String,Integer> map=new HashMap<>();

        for (String element:list){
            map.put(element, map.getOrDefault(element,0)+1);
        }
        return map;

    }
}
