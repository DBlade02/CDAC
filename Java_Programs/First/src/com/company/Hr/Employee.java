package com.company.Hr;

public class Employee {
    private String name;
    private String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
    }
}