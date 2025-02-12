package org.day02.problemstatement.collectinos.mapinterface;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void wordFrequencyCounter(String wordsFile){
        Map<String,Integer> map=new HashMap<>();
       try{
           FileReader fileReader=new FileReader(wordsFile);
           BufferedReader bufferedReader=new BufferedReader(fileReader);
           String line;
           while ((line=bufferedReader.readLine())!=null){
               line=line.toLowerCase().replaceAll("[^a-z0-9\\\\s]"," ");
               String[]words=line.split("\\s+");
               for (String word:words){
                   if (!word.isEmpty()){
                      map.put(word, map.getOrDefault(word,0)+1);
                   }
               }
           }
           fileReader.close();
           bufferedReader.close();
           System.out.println(map);


       }catch (FileNotFoundException e){
           System.out.println("file not found"+wordsFile);
       }
       catch (IOException e){
           System.out.println("Not reading input properly");
       }
    }

    public static void main(String[] args) {
        String wordsFile="StringfreqInput.txt";
        wordFrequencyCounter(wordsFile);
    }
}
