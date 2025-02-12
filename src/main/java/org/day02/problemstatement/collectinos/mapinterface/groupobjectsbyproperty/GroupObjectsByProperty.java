package org.day02.problemstatement.collectinos.mapinterface.groupobjectsbyproperty;

import java.util.*;


public class GroupObjectsByProperty {


        public static void main(String[] args) {
            // List of employees
            List<Employee> employees = Arrays.asList(
                    new Employee("Alice", "HR"),
                    new Employee("Bob", "IT"),
                    new Employee("Carol", "HR"),
                    new Employee("Dave", "IT"),
                    new Employee("Eve", "Finance")
            );

            Map<String, List<Employee>> groupedByDepartment = groupByDepartment(employees);

            System.out.println(groupedByDepartment);
        }

        public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
            Map<String, List<Employee>> departmentMap = new HashMap<>();

            for (Employee employee : employees) {
                // Get the department of the employee
                String department = employee.getDepartment();


                departmentMap
                        .computeIfAbsent(department, k -> new ArrayList<>())
                        .add(employee);
            }

            return departmentMap;
        }
}

