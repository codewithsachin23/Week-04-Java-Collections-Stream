package org.day03.problemstatement.streams.serializationsaveandretrieveanobject;

import java.io.*;
import java.util.List;

public class EmployeeSerialization {
    // Serialize employees and save to file
   public static void saveEmployeesToFile(List<Employee> employees) {
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("serilization.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fileOutputStream);
            oos.writeObject(employees);
            System.out.println("Employees have been saved to the file.");
        } catch (IOException e) {
            System.out.println("Error saving employees to file: " + e.getMessage());
        }
    }
   public static List<Employee> retrieveEmployeesFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serilization.txt"))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException e) {
            System.out.println("Error reading employees from file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
        return null;
    }
}
