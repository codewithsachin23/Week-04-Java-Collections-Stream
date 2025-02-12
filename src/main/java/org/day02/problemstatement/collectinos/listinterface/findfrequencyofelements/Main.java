package org.day02.problemstatement.collectinos.listinterface.findfrequencyofelements;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String>listOfString=new ArrayList<>();
        listOfString.add("apple");
        listOfString.add("banana");
        listOfString.add("apple");
        listOfString.add("orange");

        Map<String,Integer> map=FindFrequencyOfElements.frequencyCount(listOfString);
        System.out.println(map);

    }
}
