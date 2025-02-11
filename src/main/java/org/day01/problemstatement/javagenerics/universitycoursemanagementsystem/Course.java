package org.day01.problemstatement.javagenerics.universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourse(){
        return courses;
    }
    public T getCourse(int index) {
        if (index >= 0 && index < courses.size()) {
            return courses.get(index);
        }
        throw new IndexOutOfBoundsException("Invalid index.");
    }

    public void displayAllCourses() {
        for (T course : courses) {
            course.displayCourseInfo();
        }
    }
}
