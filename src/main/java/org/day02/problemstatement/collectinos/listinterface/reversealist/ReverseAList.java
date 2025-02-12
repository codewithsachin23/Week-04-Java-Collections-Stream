package org.day02.problemstatement.collectinos.listinterface.reversealist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseAList {
    public static <T>List<T> reverseList(List<T> list){
        int index=0;
        int left=0;
        int right=list.size()-1;
        while (left<right){
            T temp=list.get(left);
            list.set(index,list.get(right));
            list.set(right,temp);

            index++;
            left++;
            right--;
        }
        return list;
    }
}
