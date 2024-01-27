package com.employeemanagement.model;

public class InternTest {
    public static void main(String[] args) {
        // Create an Intern object and test its inheritance from Employee
        Intern intern = new Intern("Bob Johnson", "Marketing", "Supervisor");
        System.out.println("Intern ID: " + intern.getEmployeeId());
        System.out.println("Intern Name: " + intern.getEmployeeName());
        System.out.println("Intern Department: " + intern.getEmployeeDepartment());
        System.out.println("Intern Manager: " + intern.getEmployeeManager());
    }
}
