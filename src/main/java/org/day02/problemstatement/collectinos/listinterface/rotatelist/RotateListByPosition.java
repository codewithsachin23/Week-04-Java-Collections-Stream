package org.day02.problemstatement.collectinos.listinterface.rotatelist;

import java.util.ArrayList;
import java.util.List;

public class RotateListByPosition {
    public static List<Integer> rotateList(List<Integer> list,int k){
        ArrayList<Integer> temp=new ArrayList<>();
        int index=0;
        for (int i=list.size()-1;i>=0;i--){
            if(index<k){
                temp.add(list.get(i));
                index++;
            }
        }
        for (int i=0;i<list.size()-k;i++){
            temp.add(list.get(i));
        }
        System.out.println(temp);
        return temp;
    }

}
