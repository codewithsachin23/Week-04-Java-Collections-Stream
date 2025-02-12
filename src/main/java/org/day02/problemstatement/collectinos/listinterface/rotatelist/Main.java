package org.day02.problemstatement.collectinos.listinterface.rotatelist;

import org.day02.problemstatement.collectinos.listinterface.removeduplicates.RemoveDuplicates;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int k=2;
        RotateListByPosition.rotateList(list,k);

    }
}
