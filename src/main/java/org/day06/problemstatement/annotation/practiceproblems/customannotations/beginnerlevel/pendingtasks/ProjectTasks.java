package org.day06.problemstatement.annotation.practiceproblems.customannotations.beginnerlevel.pendingtasks;

public class ProjectTasks {
    //Marking method with a pending feature
    @Todo(task = "Implement user authentication", assignedTo = "Suraj", priority = "HIGH")
    public void userAuthentication() {
        System.out.println("Pending: Implement user authentication");
    }

    //Marking another method with a pending feature
    @Todo(task = "Optimize database queries", assignedTo = "Rishika")
    public void optimizeDatabase() {
        System.out.println("Pending: Optimize database queries");
    }
}