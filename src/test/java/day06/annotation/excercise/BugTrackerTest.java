package day06.annotation.excercise;


import org.day06.problemstatement.annotation.excercise.repeatableannotation.BugReport;
import org.day06.problemstatement.annotation.excercise.repeatableannotation.BugTracker;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class BugTrackerTest {
    @Test
        // test method
    public void testBugReportAnnotation() throws Exception {
        Method method = BugTracker.class.getMethod("fixBugs"); // get method
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class); // get annotations

        assertNotNull(bugReports); // check not null
        assertEquals(2, bugReports.length); // check count
        assertEquals("Null pointer exception occurs", bugReports[0].description()); // check first
        assertEquals("Performance issue in data processing", bugReports[1].description()); // check second
    }
}
