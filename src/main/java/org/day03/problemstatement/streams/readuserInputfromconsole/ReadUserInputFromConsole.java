package org.day03.problemstatement.streams.readuserInputfromconsole;

import java.io.*;

public class ReadUserInputFromConsole {
    public static void readUserInputFromConsole(String file){
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name : ");
            String name=bufferedReader.readLine();
            System.out.println("Enter your age : ");
            String age=bufferedReader.readLine();
            System.out.println("Favorite programming language : ");
            String programming=bufferedReader.readLine();

            FileWriter fileWriter=new FileWriter(file);
            fileWriter.write("name: "+name+"\n");
            fileWriter.write("age: "+age+"\n");
            fileWriter.write("Favorite programming language: "+programming+"\n");

fileWriter.flush();
        }catch (FileNotFoundException e){
            System.out.println("file not found"+e.getMessage());
        }catch (IOException e){
            System.out.println("error on reading a input"+e.getMessage());
        }
    }

}
