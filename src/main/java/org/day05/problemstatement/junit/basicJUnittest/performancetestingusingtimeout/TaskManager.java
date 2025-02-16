package org.day05.problemstatement.junit.basicJUnittest.performancetestingusingtimeout;

public class TaskManager {
    public String logRunningTask(){
        try{
            Thread.sleep(3000);

        }catch (InterruptedException e){
           Thread.currentThread().interrupt();

        }
        return "Task Completed";
    }
}
