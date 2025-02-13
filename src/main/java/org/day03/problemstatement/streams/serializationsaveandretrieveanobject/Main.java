package org.day03.problemstatement.streams.serializationsaveandretrieveanobject;
import  java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Sachin Shukla", "IT", 50000));
        employees.add(new Employee(2, "Vivek ", "HR", 45000));
        employees.add(new Employee(3, "Suraj", "Finance", 55000));

        EmployeeSerialization.saveEmployeesToFile(employees);

        // Step 3: Deserialize the list of employees from the file
        List<Employee> retrievedEmployees = EmployeeSerialization.retrieveEmployeesFromFile();

        // Step 4: Display the retrieved employees
        if (retrievedEmployees != null) {
            System.out.println("Retrieved Employees:");
            for (Employee emp : retrievedEmployees) {
                System.out.println(emp);
            }
        }

    }
}
