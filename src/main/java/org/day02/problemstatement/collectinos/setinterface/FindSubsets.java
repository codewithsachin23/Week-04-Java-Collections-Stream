package org.day02.problemstatement.collectinos.setinterface;

import java.util.HashSet;
import java.util.Set;

public class FindSubsets {
    public static boolean findSubsets(Set<Integer> set1,Set<Integer> set2){
        for (int element:set1){
        if (!set2.contains(element)){
            return false;
        }
        }
        return true;
}

    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(2);
        set1.add(3);
        Set<Integer> set2=new HashSet<>();

        set2.add(1);
        set2.add(3);
        set2.add(2);
        set2.add(4);
        System.out.println(findSubsets(set1,set2));

    }
}
