package day03.streamstesting;

import org.day03.problemstatement.streams.filehandling.readandwritetextfile.ReadAndWriteTextFile;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class ReadAndWriteTextFileTest {
    @Test
    void testReadAndWriteTextFile() {
        // Call the method to test
        ReadAndWriteTextFile.readAndWriteTextFile("ReadTextFileAndWrite.txt", "writerHere.txt");
        try  {
            FileReader fileReader=new FileReader("writerHere.txt");
            BufferedReader reader=new BufferedReader(fileReader);
            assertEquals("we are here to read and write a ", reader.readLine());
            assertEquals("file using file handling and ", reader.readLine());
            assertEquals("file writer", reader.readLine());
            assertNull(reader.readLine()); // Ensure no extra lines are present
        } catch (IOException e) {
            System.out.println("IOException occurred while reading the output file: " + e.getMessage());
        }
    }

}
