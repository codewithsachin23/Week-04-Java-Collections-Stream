package org.day02.problemstatement.collectinos.queueinterface.hospitaltriagesystem;
import java.util.PriorityQueue;

public class HospitalTriageSystem {

    public static void hospitalSystem(PriorityQueue<Patient> patientPriorityQueue){
        while (!patientPriorityQueue.isEmpty()){
            System.out.println(patientPriorityQueue.poll());
        }
    }


    public static void main(String[] args) {
        PriorityQueue<Patient> patientPriorityQueue=new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);
        patientPriorityQueue.add(new Patient("john",3));
        patientPriorityQueue.add(new Patient("Alice",5));
        patientPriorityQueue.add(new Patient("bob",2));
        hospitalSystem(patientPriorityQueue);

    }
}
