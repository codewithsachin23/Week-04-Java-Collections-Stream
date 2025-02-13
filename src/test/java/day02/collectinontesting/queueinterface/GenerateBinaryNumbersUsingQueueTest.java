package day02.collectinontesting.queueinterface;



import org.day02.problemstatement.collectinos.queueinterface.GenerateBinaryNumbersUsingQueue;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GenerateBinaryNumbersUsingQueueTest {

    @Test
    void testGenerateBinaryNumbers() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Call the method with N=5
            GenerateBinaryNumbersUsingQueue.generateBinaryNumbers(5);

            // Verify the output
            String expectedOutput = "1 10 11 100 101";
            assertEquals(expectedOutput, outputStream.toString().trim(), "The generated binary numbers are incorrect.");
        } finally {

            System.setOut(originalOut);
        }
    }
}
