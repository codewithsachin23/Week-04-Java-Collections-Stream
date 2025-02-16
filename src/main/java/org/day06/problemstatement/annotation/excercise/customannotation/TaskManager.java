package org.day06.problemstatement.annotation.excercise.customannotation;

//Using annotation in TaskManager class
public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Pratham Raj")
    public void completeTask() {
        System.out.println("Task completed");
    }
}