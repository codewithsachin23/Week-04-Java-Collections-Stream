package day03.streamstesting;

import org.day03.problemstatement.streams.readuserInputfromconsole.ReadUserInputFromConsole;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadUserInputFromConsoleTest {
    @Test
    void readUserInputFromConsoleTest(){
        String simulatedInput = "Sachin Shukla\n21\nJava\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ReadUserInputFromConsole.readUserInputFromConsole("ReadUserInputFromConsole.txt");
        try {
            FileReader fileReader=new FileReader("ReadUserInputFromConsole.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            assertEquals("name: Sachin Shukla",bufferedReader.readLine());
            assertEquals("age: 21",bufferedReader.readLine());
            assertEquals("Favorite programming language: Java",bufferedReader.readLine());

        }catch (FileNotFoundException e){
            System.out.println("File not found"+e.getMessage());
        }catch (IOException e){
            System.out.println("error on reading a input"+e.getMessage());
        }
    }
}
