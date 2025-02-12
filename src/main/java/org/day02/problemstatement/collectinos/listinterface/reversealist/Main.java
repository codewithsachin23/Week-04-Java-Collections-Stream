package org.day02.problemstatement.collectinos.listinterface.reversealist;

import java.util.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("using Array List");
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println("after reverse");
        System.out.println(ReverseAList.reverseList(list));
        System.out.println("==============================================================");
        System.out.println("Using LinkedList");

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
        System.out.println("after reverse");
        System.out.println(ReverseAList.reverseList(linkedList));

    }
}
