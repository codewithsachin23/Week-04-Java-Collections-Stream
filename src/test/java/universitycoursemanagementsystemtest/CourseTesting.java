package universitycoursemanagementsystemtest;

import org.day01.problemstatement.javagenerics.universitycoursemanagementsystem.AssignmentCourse;
import org.day01.problemstatement.javagenerics.universitycoursemanagementsystem.Course;
import org.day01.problemstatement.javagenerics.universitycoursemanagementsystem.ExamCourse;
import org.day01.problemstatement.javagenerics.universitycoursemanagementsystem.ResearchCourse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTesting {
    @Test
    void examCourseTesting(){
        Course<ExamCourse> examCourse=new Course<>();

        examCourse.addCourse(new ExamCourse("Math", "Science", 100));
        examCourse.addCourse(new ExamCourse("English", "Arts", 80));

        ExamCourse examCourse1=examCourse.getCourse(0);
        assertEquals("Math",examCourse1.getCourseName());
        assertEquals("Science",examCourse1.getDepartment());
        assertEquals(100,examCourse1.getExamMarks());

    }
    @Test
    void assignmentCourseTesting(){
        Course<AssignmentCourse> assignmentCourses=new Course<>();

        assignmentCourses.addCourse(new AssignmentCourse("History", "Humanities", 5));
        assignmentCourses.addCourse(new AssignmentCourse("Geography", "Social Science", 4));

        AssignmentCourse examCourse1=assignmentCourses.getCourse(0);
        assertEquals("History",examCourse1.getCourseName());
        assertEquals("Humanities",examCourse1.getDepartment());
        assertEquals(5,examCourse1.getTotalAssignments());

    }
    @Test
    void researchCourseTesting(){
        Course<ResearchCourse>  researchCourse=new Course<>();

        researchCourse.addCourse(new ResearchCourse("AI", "Computer Science", "Machine Learning"));
        researchCourse.addCourse(new ResearchCourse("Plants", "Biology", "Photosynthesis"));

        ResearchCourse examCourse1=researchCourse.getCourse(0);
        assertEquals("AI",examCourse1.getCourseName());
        assertEquals("Computer Science",examCourse1.getDepartment());
        assertEquals("Machine Learning",examCourse1.getResearchTopic());

    }

}
