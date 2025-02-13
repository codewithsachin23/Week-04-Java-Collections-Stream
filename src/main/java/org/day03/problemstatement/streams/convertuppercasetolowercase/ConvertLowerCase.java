package org.day03.problemstatement.streams.convertuppercasetolowercase;

import java.io.*;

public class ConvertLowerCase {
        public static void convertLowerCase(String filepath ,String writeHere){
            try {
                FileReader fileReader=new FileReader(filepath);
                FileWriter fileWriter=new FileWriter(writeHere);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                String line;
                while ((line=bufferedReader.readLine())!=null){
                    line=line.toLowerCase();
                    fileWriter.write(line+"\n");
                }
                fileWriter.flush();

            }catch (FileNotFoundException e){
                System.out.println("File not found"+e);
            }catch (IOException e){
                System.out.println("error on reading a input"+e);
            }

        }
    }