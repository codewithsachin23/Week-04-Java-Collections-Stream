package day04.exceptionstesting;

import org.day04.problemstatement.exceptions.checkedexception.CheckedException;
import org.junit.jupiter.api.Test;

import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class CheckedExceptionTest {
    @Test
    void testFileNotFound() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        CheckedException.main(new String[]{});

        String output = outputStream.toString().trim();
        assertTrue(!output.contains("File not found"), "Expected 'File not found' message in output, but got: " + output);
    }
}

