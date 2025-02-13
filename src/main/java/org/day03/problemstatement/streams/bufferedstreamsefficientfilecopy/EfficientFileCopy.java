package org.day03.problemstatement.streams.bufferedstreamsefficientfilecopy;

import java.io.*;

public class EfficientFileCopy {

    // Method to copy a file using Buffered Streams
    public static long copyUsingBufferedStreams(String source, String target) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target))) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            long startTime = System.nanoTime();
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            long endTime = System.nanoTime();

            return endTime - startTime; // Execution time in nanoseconds
        }
    }

    // Method to copy a file using Unbuffered Streams
    public static long copyUsingUnbufferedStreams(String source, String target) throws IOException {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target)) {

            int data;

            long startTime = System.nanoTime();
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            long endTime = System.nanoTime();

            return endTime - startTime; // Execution time in nanoseconds
        }
    }

}
