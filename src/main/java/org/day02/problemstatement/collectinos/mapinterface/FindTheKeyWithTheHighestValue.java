package org.day02.problemstatement.collectinos.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class FindTheKeyWithTheHighestValue {

    public static String keyWithTheHighestValue(Map<String, Integer> originalMap){
        String maxKey="";
        int maxValue=Integer.MIN_VALUE;
        for (Map.Entry<String,Integer> entry:originalMap.entrySet()){
            int value=entry.getValue();
            String key=entry.getKey();
            if(value>maxValue){
                maxKey=key;
                maxValue=value;
            }
        }
        return maxKey;

    }
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A",10);
        originalMap.put("B",20);
        originalMap.put("C",15);

        System.out.println(keyWithTheHighestValue(originalMap));

    }
}
