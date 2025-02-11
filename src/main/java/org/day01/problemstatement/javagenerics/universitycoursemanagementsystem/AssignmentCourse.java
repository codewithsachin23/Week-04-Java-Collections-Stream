package org.day01.problemstatement.javagenerics.universitycoursemanagementsystem;

public class AssignmentCourse extends CourseType {
    private int totalAssignments;

    public AssignmentCourse(String courseName, String department, int totalAssignments) {
        super(courseName, department);
        this.totalAssignments = totalAssignments;
    }
    public int getTotalAssignments(){
        return totalAssignments;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Assignment Course: " + getCourseName() + " | Department: " + getDepartment() +
                " | Assignments: " + totalAssignments);
    }
}
