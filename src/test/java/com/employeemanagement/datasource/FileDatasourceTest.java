package com.employeemanagement.datasource;

import com.employeemanagement.model.Employee;
import com.employeemanagement.exception.InvalidDataFormatException;

public class FileDatasourceTest {
    public static void main(String[] args) {
        // Test reading from file
        FileDatasource fileDatasource = new FileDatasource();
        String fileData = "12345-Vishal Gupta-Fo Tech-Fiaz Mohamed";

        try {
            Employee employee = fileDatasource.readEmployee(fileData);
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Employee Department: " + employee.getEmployeeDepartment());
            System.out.println("Employee Manager: " + employee.getEmployeeManager());
        } catch (InvalidDataFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
