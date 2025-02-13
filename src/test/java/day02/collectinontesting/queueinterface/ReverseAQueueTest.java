package day02.collectinontesting.queueinterface;

import org.day02.problemstatement.collectinos.queueinterface.ReverseAQueue;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseAQueueTest {
    @Test
void testReverseQueue() {
    // Test Case 1: Normal Queue with elements
    Queue<Integer> queue = new LinkedList<>();
    queue.add(10);
    queue.add(20);
    queue.add(30);

    Queue<Integer> expectedQueue = new LinkedList<>();
    expectedQueue.add(30);
    expectedQueue.add(20);
    expectedQueue.add(10);

    ReverseAQueue.reverseQueue(queue);

    assertEquals(expectedQueue, queue, "Queue was not reversed correctly");

}}
