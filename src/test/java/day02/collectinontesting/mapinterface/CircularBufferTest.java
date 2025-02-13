package day02.collectinontesting.mapinterface;



import org.day02.problemstatement.collectinos.queueinterface.circularbuffersimulation.CircularBuffer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {

    @Test
    void testAddAndPrintBuffer() {
        CircularBuffer buffer = new CircularBuffer(3);

        // Add elements to the buffer
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);

        // Verify buffer content
        assertArrayEquals(new int[]{1, 2, 3}, buffer.getCurrentBuffer());

        // Add another element, which should overwrite the oldest (1)
        buffer.add(4);
        assertArrayEquals(new int[]{2, 3, 4}, buffer.getCurrentBuffer());
    }
}
