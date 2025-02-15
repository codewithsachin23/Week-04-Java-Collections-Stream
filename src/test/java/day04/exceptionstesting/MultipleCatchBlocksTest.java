package day04.exceptionstesting;



import org.day04.problemstatement.exceptions.multiplecatchblocks.MultipleCatchBlocks;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class MultipleCatchBlocksTest {

    @Test
    void testValidInput() {
        String input = "3\n10\n20\n30\n1\n"; // Array of size 3, accessing index 1
        String expectedOutput = "Value at index 1: 20";

        assertConsoleOutput(input, expectedOutput);
    }

    @Test
    void testArrayIndexOutOfBounds() {
        String input = "3\n10\n20\n30\n5\n"; // Array of size 3, accessing index 5 (out of bounds)
        String expectedOutput = "Invalid Index!";

        assertConsoleOutput(input, expectedOutput);
    }

    @Test
    void testNullPointerException() {
        String input = "0\n1\n"; // Providing extra input to avoid NoSuchElementException
        String expectedOutput = "Array is not initialized!";

        assertConsoleOutput(input, expectedOutput);
    }

    private void assertConsoleOutput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        MultipleCatchBlocks.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertTrue(consoleOutput.contains(expectedOutput), "Expected output: " + expectedOutput + " but got: " + consoleOutput);
    }
}

