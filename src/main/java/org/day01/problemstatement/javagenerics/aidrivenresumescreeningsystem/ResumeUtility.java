package org.day01.problemstatement.javagenerics.aidrivenresumescreeningsystem;

import java.util.List;

public class ResumeUtility {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayResume();
        }
    }
}
