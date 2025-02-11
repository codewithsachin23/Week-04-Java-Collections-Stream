package org.day01.problemstatement.javagenerics.universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class MultiLevelUniversityCourseManagementSystem {
    public static void main(String[] args) {
        // Creating course lists
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Adding simple subjects
        examCourses.addCourse(new ExamCourse("Math", "Science", 100));
        examCourses.addCourse(new ExamCourse("English", "Arts", 80));

        assignmentCourses.addCourse(new AssignmentCourse("History", "Humanities", 5));
        assignmentCourses.addCourse(new AssignmentCourse("Geography", "Social Science", 4));

        researchCourses.addCourse(new ResearchCourse("AI", "Computer Science", "Machine Learning"));
        researchCourses.addCourse(new ResearchCourse("Plants", "Biology", "Photosynthesis"));

        // Displaying courses
        System.out.println(" Exam-Based Courses ");
        examCourses.displayAllCourses();

        System.out.println(" Assignment-Based Courses");
        assignmentCourses.displayAllCourses();

        System.out.println(" Research-Based Courses ");
        researchCourses.displayAllCourses();

        // Using wildcard method to display all courses
        System.out.println("Displaying Courses with Utility Method ");
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(new ExamCourse("Physics", "Science", 90));
        allCourses.add(new AssignmentCourse("Civics", "Social Science", 3));
        allCourses.add(new ResearchCourse("Space", "Physics", "Black Holes"));

        CourseUtility.displayCourses(allCourses);
    }
}
