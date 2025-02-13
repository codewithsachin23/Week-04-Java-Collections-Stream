package org.day03.problemstatement.streams.countwordsinafile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;
import java.util.stream.Collectors;

public class CountWordsInFile {
    public static void countWordsInFile(String filepath){
        HashMap<String,Integer> map=new HashMap<>();

        try {
            FileReader fileReader=new FileReader(filepath);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String[]words= line.split("\\s+");
                for (int i=0;i< words.length;i++){
                    map.put(words[i], map.getOrDefault(words[i],+0)+1);
                }
            }


            List<Map.Entry<String, Integer>> topWords = map.entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .limit(5)
                    .collect(Collectors.toList());

            System.out.println(topWords);
            fileReader.close();
            bufferedReader.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found"+e);
        }catch (IOException e){
            System.out.println("error on reading a input"+e);
        }
    }
}
