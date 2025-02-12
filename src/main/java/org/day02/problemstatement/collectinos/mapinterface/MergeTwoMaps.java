package org.day02.problemstatement.collectinos.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {

    public static Map<String,Integer> mergeTwoMaps(Map<String,Integer> map1, Map<String,Integer>map2){
        Map<String, Integer> map = new HashMap<>(map1);
       for (Map.Entry<String,Integer> entry: map2.entrySet()){
           String key=entry.getKey();
           if (map.containsKey(key)){
               map.put(key,map.getOrDefault(key,0)+ map2.get(key));
           }else{
               map.put(key, entry.getValue());
           }

       }
       return map;

    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println(mergeTwoMaps(map,map2));

    }

}
