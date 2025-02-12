package org.day02.problemstatement.collectinos.mapinterface.groupobjectsbyproperty;

class Employee {
    private String name;
    private String department;

    // Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }



    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name; // Print just the employee's name
    }
}
