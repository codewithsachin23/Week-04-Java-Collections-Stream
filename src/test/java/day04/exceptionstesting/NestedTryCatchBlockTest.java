package day04.exceptionstesting;

import org.day04.problemstatement.exceptions.nestedtrycatchblock.NestedTryCatchBlock;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class NestedTryCatchBlockTest {

    @Test
    void testValidInput() {
        String input = "3\n10\n20\n30\n1\n5\n"; // Array of size 3, accessing index 1, divisor 5
        String expectedOutput = "Result of division: 4";

        assertConsoleOutput(input, expectedOutput);
    }

    @Test
    void testArrayIndexOutOfBounds() {
        String input = "2\n5\n10\n5\n3\n"; // Array of size 2, accessing index 5 (out of bounds)
        String expectedOutput = "Invalid array index!";

        assertConsoleOutput(input, expectedOutput);
    }

    @Test
    void testDivideByZero() {
        String input = "3\n10\n20\n30\n1\n0\n"; // Array of size 3, accessing index 1, divisor 0
        String expectedOutput = "Cannot divide by zero!";

        assertConsoleOutput(input, expectedOutput);
    }

    private void assertConsoleOutput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        NestedTryCatchBlock.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertTrue(consoleOutput.contains(expectedOutput), "Expected output: " + expectedOutput + " but got: " + consoleOutput);
    }
}
