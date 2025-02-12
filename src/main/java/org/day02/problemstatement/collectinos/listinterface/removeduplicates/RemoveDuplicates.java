package org.day02.problemstatement.collectinos.listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer>list){
        HashSet<Integer>set=new HashSet<>();
        int index=0;
        for (int element:list){
            if (set.add(element)){
               list.set(index,element);
               index++;
            }
        }

        while (list.size() > index) {
            list.remove(list.size() - 1);
        }
        return list;

        }
}
