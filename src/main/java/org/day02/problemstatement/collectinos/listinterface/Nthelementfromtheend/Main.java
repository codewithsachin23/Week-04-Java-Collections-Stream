package org.day02.problemstatement.collectinos.listinterface.Nthelementfromtheend;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        int n=2;
        NthElementFromTheEnd.findElement(list,2);

    }
}
