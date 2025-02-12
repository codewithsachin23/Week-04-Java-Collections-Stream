package org.day02.problemstatement.collectinos.listinterface.rotatelist;

import java.util.ArrayList;
import java.util.List;

public class RotateListByPosition {
    public static List<Integer> rotateList(List<Integer> list,int k) {
        if (list == null || list.isEmpty() || k <= 0) {
            return list;
        }

        int size = list.size();
        k = k % size;


        List<Integer> temp = new ArrayList<>();
        temp.addAll(list.subList(size - k, size));
        temp.addAll(list.subList(0, size - k));

        System.out.println(temp); // For debugging
        return temp;
    }

}
