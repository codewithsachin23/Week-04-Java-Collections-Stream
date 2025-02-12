package org.day02.problemstatement.collectinos.setinterface;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
       HashSet<Integer> symmetricSet=new HashSet<>();
        for (int element:set1){
            if(!set2.contains(element)) {
                symmetricSet.add(element);
            }
        }
        for (Integer element : set2) {
            if (!set1.contains(element)) {
                symmetricSet.add(element);
            }
        }
        return symmetricSet;
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
        System.out.println(symmetricDifference(set1,set2));
    }

}
