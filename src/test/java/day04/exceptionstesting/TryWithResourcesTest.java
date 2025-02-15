package day04.exceptionstesting;

import org.day04.problemstatement.exceptions.trywithresources.TryWithResources;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TryWithResourcesTest {
    @Test
    void testFileNotFound() {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        TryWithResources.main(new String[]{});

        // Check if output contains "file not found"
        String output = outputStream.toString().trim();
        assertTrue(!output.contains("file not found"), "Expected 'file not found' message in output");
    }
}
