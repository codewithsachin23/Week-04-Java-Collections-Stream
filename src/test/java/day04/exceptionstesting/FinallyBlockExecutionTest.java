package day04.exceptionstesting;
import org.day04.problemstatement.exceptions.finallyblockexecution.FinallyBlockExecution;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class FinallyBlockExecutionTest {
        void testValidInput() {
            String input = "10\n2\n";
            String expectedOutput = "Output is 5\nOperation completed";

            assertConsoleOutput(input, expectedOutput);
        }

        @Test
        void testDivisionByZero() {
            String input = "10\n0\n";
            String expectedOutput = "Division by zero is not allowed";

            assertConsoleOutput(input, expectedOutput);
        }

        @Test
        void testInputMismatch() {
            String input = "10\nabc\n"; // Invalid input (InputMismatchException)
            String expectedOutput = "Please enter numeric values only";

            assertConsoleOutput(input, expectedOutput);
        }

        private void assertConsoleOutput(String input, String expectedOutput) {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setIn(in);
            System.setOut(new PrintStream(out));

            FinallyBlockExecution.main(new String[]{});

            String consoleOutput = out.toString().trim();
            assertTrue(consoleOutput.contains(expectedOutput),
                    "Expected output to contain: \n" + expectedOutput + "\nBut got:\n" + consoleOutput);
        }
}