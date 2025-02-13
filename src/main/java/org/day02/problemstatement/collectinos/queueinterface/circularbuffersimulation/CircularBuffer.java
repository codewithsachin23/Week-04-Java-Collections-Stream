package org.day02.problemstatement.collectinos.queueinterface.circularbuffersimulation;

public class CircularBuffer {
    private int[] buffer;
    private int head;
    private int tail;
    private int size;

    // Constructor to initialize the buffer
    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void add(int value) {
        if (size == buffer.length) {
            // Buffer is full, overwrite the oldest element
            head = (head + 1) % buffer.length;
        } else {
            size++;
        }
        buffer[tail] = value;
        tail = (tail + 1) % buffer.length;
    }

    // Get the current elements in the buffer
    public void printBuffer() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            int index = (head + i) % buffer.length;
            System.out.print(buffer[index]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public int[] getCurrentBuffer() {
        int[] currentBuffer = new int[size];
        for (int i = 0; i < size; i++) {
            currentBuffer[i] = buffer[(head + i) % buffer.length];
        }
        return currentBuffer;
    }

}
