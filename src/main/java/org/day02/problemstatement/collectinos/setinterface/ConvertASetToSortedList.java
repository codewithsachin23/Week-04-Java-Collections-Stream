package org.day02.problemstatement.collectinos.setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertASetToSortedList {
    public static List<Integer> convertASetSortedList(Set<Integer> set){
        List<Integer> list=new ArrayList<>(set);
        for (int i=0;i<list.size()-1;i++){
            for (int j=0;j<list.size()-1-i;j++){
                if (list.get(j)>list.get(j+1)){
                    int temp=list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(5);
        set1.add(3);
        set1.add(9);
        set1.add(1);
        System.out.println(convertASetSortedList(set1));
    }

}
