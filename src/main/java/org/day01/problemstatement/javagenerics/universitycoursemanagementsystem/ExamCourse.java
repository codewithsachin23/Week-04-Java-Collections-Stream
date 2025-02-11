package org.day01.problemstatement.javagenerics.universitycoursemanagementsystem;

public class ExamCourse extends CourseType {
    private int examMarks;

    public ExamCourse(String courseName, String department, int examMarks) {
        super(courseName, department);
        this.examMarks = examMarks;
    }
    public int getExamMarks(){
        return examMarks;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Exam Course: " + getCourseName() + " | Department: " + getDepartment() +
                " | Exam Marks: " + examMarks);
    }
}
