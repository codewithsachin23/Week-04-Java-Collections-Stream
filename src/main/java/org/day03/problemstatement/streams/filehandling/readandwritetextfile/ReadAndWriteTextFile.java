package org.day03.problemstatement.streams.filehandling.readandwritetextfile;

import java.io.*;

public class ReadAndWriteTextFile {
    public static void readAndWriteTextFile(String filepath ,String writeHere){
        try {
            FileReader fileReader=new FileReader(filepath);
           FileWriter fileWriter=new FileWriter(writeHere);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                fileWriter.write(line+"\n");
                System.out.println(line);
            }
           fileWriter.flush();

        }catch (FileNotFoundException e){
            System.out.println("File not found"+e);
        }catch (IOException e){
            System.out.println("error on reading a input"+e);
        }

    }
}
