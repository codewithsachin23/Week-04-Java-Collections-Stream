package day02.collectinontesting.queueinterface;


import org.day02.problemstatement.collectinos.queueinterface.implementastackusingqueue.ImplementAStackUsingQueues;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImplementAStackUsingQueuesTest {

    @Test
    void testStackOperations() {
        ImplementAStackUsingQueues stack = new ImplementAStackUsingQueues();

        // Test initial state
        assertFalse(stack.isEmpty(), "Stack should be empty initially.");

        // Test push operation
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek(), "Top of the stack should be 3 after pushing 1, 2, 3.");

        // Test pop operation
        assertEquals(3, stack.pop(), "Pop should return 3.");
        assertEquals(2, stack.peek(), "Top of the stack should now be 2.");

        stack.push(4);
        assertEquals(4, stack.peek(), "Top of the stack should now be 4 after pushing 4.");

        assertEquals(4, stack.pop(), "Pop should return 4.");



        // Test isEmpty after all pops
        assertTrue(stack.isEmpty(), "Stack should be empty after all elements are popped.");
    }
}
