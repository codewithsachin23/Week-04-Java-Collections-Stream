package org.day02.problemstatement.collectinos.listinterface.Nthelementfromtheend;

import java.util.List;

public class NthElementFromTheEnd {
    public static String findElement(List<String>list,int n){
        int size=list.size();
        if(n>size){
            return null;
        }

        int nth=size-n;

        System.out.println(list.get(nth));
        return list.get(nth);
    }
}
