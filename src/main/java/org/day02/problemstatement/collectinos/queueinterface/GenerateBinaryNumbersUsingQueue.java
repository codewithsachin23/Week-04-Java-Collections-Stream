package org.day02.problemstatement.collectinos.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbersUsingQueue {
    public static void  generateBinaryNumbers(int N){
        Queue<String> queue=new LinkedList<>();

        queue.offer("1");

        for (int i=0;i<N;i++){
            String current=queue.poll();
            System.out.print(current+" ");
            queue.offer(current +"0");
            queue.offer(current +"1");
        }
    }

    public static void main(String[] args) {
        int N=10;
        generateBinaryNumbers(N);
    }
}
