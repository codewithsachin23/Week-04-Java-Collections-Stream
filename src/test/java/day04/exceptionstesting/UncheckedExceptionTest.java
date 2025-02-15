package day04.exceptionstesting;
import org.day04.problemstatement.exceptions.uncheckedexception.UncheckedException;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UncheckedExceptionTest {
    @Test
    void testDivisionByZero() {
        // Simulate user input: number1 = 10, number2 = 0
        ByteArrayInputStream inputStream = new ByteArrayInputStream("10\n0\n".getBytes());
        System.setIn(inputStream);

        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        UncheckedException.main(new String[]{});

        // Verify the output contains division by zero error message
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Division by zero is not allowed"), "Expected 'Division by zero is not allowed' message in output");
    }

    @Test
    void testInputMismatch() {
        // Simulate invalid input: "abc" instead of a number
        ByteArrayInputStream inputStream = new ByteArrayInputStream("abc\n".getBytes());
        System.setIn(inputStream);

        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        UncheckedException.main(new String[]{});

        // Verify the output contains numeric input error message
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Please enter numeric values only"), "Expected 'Please enter numeric values only' message in output");
    }
}
