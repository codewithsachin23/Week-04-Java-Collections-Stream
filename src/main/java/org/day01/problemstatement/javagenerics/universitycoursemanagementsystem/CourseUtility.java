package org.day01.problemstatement.javagenerics.universitycoursemanagementsystem;

import java.util.List;

public class CourseUtility {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayCourseInfo();
        }
    }
}
