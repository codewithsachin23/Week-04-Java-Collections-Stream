package org.day04.problemstatement.exceptions.trywithresources;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
       try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))){
           String firstLine = reader.readLine();
           if (firstLine != null) {
               System.out.println("First line of the file: " + firstLine);
           }
       }catch (FileNotFoundException e){
           System.out.println("file not found"+e.getMessage());
       }
       catch (IOException e){
           System.out.println("Error on reading a input");
       }
    }
}
