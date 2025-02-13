package org.day03.problemstatement.streams.bufferedstreamsefficientfilecopy;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "filee_500mb.txt";
        String bufferedTargetFile = "bufferedCopy.txt";
        String unbufferedTargetFile = "unbufferedCopy.txt";

        try {
            // Copy using buffered streams and measure time
            long bufferedTime = EfficientFileCopy.copyUsingBufferedStreams(sourceFile, bufferedTargetFile);
            System.out.println("Time taken with Buffered Streams: " + bufferedTime + " nanoseconds");

            // Copy using unbuffered streams and measure time
            long unbufferedTime = EfficientFileCopy.copyUsingUnbufferedStreams(sourceFile, unbufferedTargetFile);
            System.out.println("Time taken with Unbuffered Streams: " + unbufferedTime + " nanoseconds");

            // Compare performance
            if (bufferedTime < unbufferedTime) {
                System.out.println("Buffered Streams are faster by " + (unbufferedTime - bufferedTime) + " nanoseconds.");
            } else {
                System.out.println("Unbuffered Streams are faster by " + (bufferedTime - unbufferedTime) + " nanoseconds.");
            }
        } catch (IOException e) {
            System.out.println("Error during file operations: " + e.getMessage());
        }
    }
}
