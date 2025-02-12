package org.day02.problemstatement.collectinos.setinterface;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionTwoSet {
    public static void unionAndIntersection(Set<Integer> set1, Set<Integer> set2){
        HashSet<Integer> union=new HashSet<>();
        HashSet<Integer> intersection=new HashSet<>();
        for (int element:set1){
            union.add(element);
            if(set2.contains(element)){
                intersection.add(element);
            }
        }
        for (int element:set2){
            union.add(element);
        }
        System.out.println("union of two set");
        System.out.println(union);
        System.out.println("intersection of two set");

        System.out.println(intersection);
    }

    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
       unionAndIntersection(set1,set2);

    }
}
