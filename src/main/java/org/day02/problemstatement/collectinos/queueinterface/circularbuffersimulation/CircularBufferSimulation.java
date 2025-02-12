package org.day02.problemstatement.collectinos.queueinterface.circularbuffersimulation;

public class CircularBufferSimulation {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        // Insert elements into the buffer
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.printBuffer();

        // Add an element, overwriting the oldest one
        buffer.add(4);
        buffer.printBuffer();

    }
}
