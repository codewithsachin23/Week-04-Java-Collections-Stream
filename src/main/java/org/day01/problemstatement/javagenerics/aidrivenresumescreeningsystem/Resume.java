package org.day01.problemstatement.javagenerics.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }
    public T getResumes(int index) {
        if (index >= 0 && index < resumes.size()) {
            return resumes.get(index);
        }
        throw new IndexOutOfBoundsException("Invalid index.");
    }

    public void displayAllResumes() {
        for (T resume : resumes) {
            resume.displayResume();
        }
    }
}
