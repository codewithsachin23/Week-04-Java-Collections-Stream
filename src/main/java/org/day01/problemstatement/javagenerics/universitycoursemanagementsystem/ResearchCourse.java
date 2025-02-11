package org.day01.problemstatement.javagenerics.universitycoursemanagementsystem;

public class ResearchCourse extends CourseType {
    private String researchTopic;

    public ResearchCourse(String courseName, String department, String researchTopic) {
        super(courseName, department);
        this.researchTopic = researchTopic;
    }
    public String getResearchTopic(){
        return researchTopic;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Research Course: " + getCourseName() + " | Department: " + getDepartment() +
                " | Topic: " + researchTopic);
    }
}
