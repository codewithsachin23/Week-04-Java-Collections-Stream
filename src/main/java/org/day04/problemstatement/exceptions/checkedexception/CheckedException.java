package org.day04.problemstatement.exceptions.checkedexception;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String file="data.txt";
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }

            fileReader.close();
            bufferedReader.close();

        }catch (IOException e){
            System.out.println("File not found"+e.getMessage());

        }
    }
}
