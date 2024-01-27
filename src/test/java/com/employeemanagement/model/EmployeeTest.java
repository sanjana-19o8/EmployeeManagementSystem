package com.employeemanagement.model;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create an Employee object and test its getters
        Employee employee = new Employee("John Doe", "IT", "Manager");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Department: " + employee.getEmployeeDepartment());
        System.out.println("Employee Manager: " + employee.getEmployeeManager());
    }
}
