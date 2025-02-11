package org.day01.problemstatement.javagenerics.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {
        // Creating resume lists
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        Resume<DataScientist> dsResumes = new Resume<>();
        Resume<ProductManager> pmResumes = new Resume<>();

        // Adding candidates
        seResumes.addResume(new SoftwareEngineer("Sachin shukla", 5, "Java"));
        seResumes.addResume(new SoftwareEngineer("Suraj Kumar Patel", 3, "Python"));

        dsResumes.addResume(new DataScientist("Vivek", 4, "cloud"));
        dsResumes.addResume(new DataScientist("Rishi", 2, "ruby"));

        pmResumes.addResume(new ProductManager("ravi", 6, 10));
        pmResumes.addResume(new ProductManager("Rahul", 8, 15));

        // Displaying resumes per role
        System.out.println("=== Software Engineer Resumes ===");
        seResumes.displayAllResumes();

        System.out.println("=== Data Scientist Resumes ===");
        dsResumes.displayAllResumes();

        System.out.println("=== Product Manager Resumes ===");
        pmResumes.displayAllResumes();

        // Using wildcard method to process all resumes
        System.out.println("=== Processing All Resumes with Utility Method ===");
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(new SoftwareEngineer("Suresh Gupta", 7, "C++"));
        allResumes.add(new DataScientist("Pooja Malhotra", 5, "SQL"));
        allResumes.add(new ProductManager("Ravi Shankar", 10, 20));

        ResumeUtility.processResumes(allResumes);
    }
}

