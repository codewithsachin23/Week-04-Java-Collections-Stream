package org.day03.problemstatement.streams.readalargefilelinebyline;

import java.io.*;

public class ReadLargeFileLineByLine {
        public static void readLargeFileLineByLine(String filepath ){
            try {
                FileReader fileReader=new FileReader(filepath);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                String line;
                while ((line=bufferedReader.readLine())!=null){
                    String[]words= line.split("\\s+");
                    for (int i=0;i< words.length-1;i++){
                        if (words[i].equals("error")){
                            System.out.println(line);
                            break;
                        }
                    }
                }
                fileReader.close();
                bufferedReader.close();
            }catch (FileNotFoundException e){
                System.out.println("File not found"+e);
            }catch (IOException e){
                System.out.println("error on reading a input"+e);
            }

        }
    }

