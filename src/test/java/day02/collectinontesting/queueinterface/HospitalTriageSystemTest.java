package day02.collectinontesting.queueinterface;



import org.day02.problemstatement.collectinos.queueinterface.hospitaltriagesystem.Patient;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class HospitalTriageSystemTest {

    @Test
    void testHospitalSystem() {
        // Create a PriorityQueue with a comparator based on severity (higher severity first)
        PriorityQueue<Patient> patientPriorityQueue = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

        // Add test patients to the queue
        patientPriorityQueue.add(new Patient("John", 3));
        patientPriorityQueue.add(new Patient("Alice", 5));
        patientPriorityQueue.add(new Patient("Bob", 2));

        // Capture the expected order of patients based on severity
        String[] expectedOrder = {
                "Alice (Severity: 5)",
                "John (Severity: 3)",
                "Bob (Severity: 2)"
        };

        // Process the patients and verify the order
        int index = 0;
        while (!patientPriorityQueue.isEmpty()) {
            Patient processedPatient = patientPriorityQueue.poll();
            assertEquals(expectedOrder[index], processedPatient.toString(), "Patient order is incorrect.");
            index++;
        }
    }
}
