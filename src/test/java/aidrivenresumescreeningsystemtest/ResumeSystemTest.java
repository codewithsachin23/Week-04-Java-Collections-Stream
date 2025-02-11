package aidrivenresumescreeningsystemtest;

import org.day01.problemstatement.javagenerics.aidrivenresumescreeningsystem.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ResumeSystemTest {

    private Resume<SoftwareEngineer> seResumes;
    private Resume<DataScientist> dsResumes;
    private Resume<ProductManager> pmResumes;

    @BeforeEach
    void setUp() {
        seResumes = new Resume<>();
        dsResumes = new Resume<>();
        pmResumes = new Resume<>();
    }

    @Test
    void softwareEngineerResumeTesting() {
        seResumes.addResume(new SoftwareEngineer("Pratham Raj", 5, "Java"));
        seResumes.addResume(new SoftwareEngineer("Suraj Kumar Patel", 3, "Python"));

        SoftwareEngineer se1 = seResumes.getResumes(0);
        SoftwareEngineer se2 = seResumes.getResumes(1);

        assertEquals("Pratham Raj", se1.getCandidateName());
        assertEquals(5, se1.getExperienceYears());
        assertEquals("Java", se1.getProgrammingLanguage());

        assertEquals("Suraj Kumar Patel", se2.getCandidateName());
        assertEquals(3, se2.getExperienceYears());
        assertEquals("Python", se2.getProgrammingLanguage());
    }

    @Test
    void dataScientistResumeTesting() {
        dsResumes.addResume(new DataScientist("Vivek Sahu", 4, "TensorFlow"));
        dsResumes.addResume(new DataScientist("Rishika Bisht", 2, "R"));

        DataScientist ds1 = dsResumes.getResumes(0);
        DataScientist ds2 = dsResumes.getResumes(1);

        assertEquals("Vivek Sahu", ds1.getCandidateName());
        assertEquals(4, ds1.getExperienceYears());
        assertEquals("TensorFlow", ds1.getTool());

        assertEquals("Rishika Bisht", ds2.getCandidateName());
        assertEquals(2, ds2.getExperienceYears());
        assertEquals("R", ds2.getTool());
    }

    @Test
    void productManagerResumeTesting() {
        pmResumes.addResume(new ProductManager("Muskan Kumari", 6, 10));
        pmResumes.addResume(new ProductManager("Rahul", 8, 15));

        ProductManager pm1 = pmResumes.getResumes(0);
        ProductManager pm2 = pmResumes.getResumes(1);

        assertEquals("Muskan Kumari", pm1.getCandidateName());
        assertEquals(6, pm1.getExperienceYears());
        assertEquals(10, pm1.getProjectsManaged());

        assertEquals("Rahul", pm2.getCandidateName());
        assertEquals(8, pm2.getExperienceYears());
        assertEquals(15, pm2.getProjectsManaged());
    }

    @Test
    void utilityProcessResumesTesting() {
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(new SoftwareEngineer("Suresh Gupta", 7, "C++"));
        allResumes.add(new DataScientist("Pooja Malhotra", 5, "SQL"));
        allResumes.add(new ProductManager("Ravi Shankar", 10, 20));

        assertDoesNotThrow(() -> ResumeUtility.processResumes(allResumes));
    }
}