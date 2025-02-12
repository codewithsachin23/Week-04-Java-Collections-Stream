package org.day02.problemstatement.collectinos.queueinterface.implementastackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementAStackUsingQueues {
    Queue<Integer>q1=new LinkedList<>();
    Queue<Integer>q2=new LinkedList<>();
    int size;

    public void push(int element){
        q1.offer(element);
        size++;
    }

    public boolean isEmpty(){
        if (q1.size()==0){
            return false;
        }
        return true;
    }
    public int  pop(){
        if (q1.isEmpty()){
             return 0;
        }
        while (!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        int top=0;

        while (!q2.isEmpty()){
            if (q2.size()==1){
               top=q2.poll();
               size--;

            }else {
            q1.offer(q2.poll());
            }
        }

        return top;
    }
    public int  peek(){
        if (q1.isEmpty()){
            return 0;
        }
        while (!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        int top=0;

        while (!q2.isEmpty()){
            if (q2.size()==1){
                top=q2.peek();
            }
            q1.offer(q2.poll());
        }

        return top;
    }


}
