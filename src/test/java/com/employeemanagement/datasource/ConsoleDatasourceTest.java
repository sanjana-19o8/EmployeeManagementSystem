package com.employeemanagement.datasource;

import com.employeemanagement.model.Employee;
import com.employeemanagement.exception.InvalidDataFormatException;

import java.util.Scanner;

public class ConsoleDatasourceTest {
    public static void main(String[] args) {
        // Test reading from console
        ConsoleDatasource consoleDatasource = new ConsoleDatasource();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee data (each attribute on a new line):");
        String consoleData = scanner.nextLine() + "\n" + scanner.nextLine() + "\n" + scanner.nextLine();

        try {
            Employee employee = consoleDatasource.readEmployee(consoleData);
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Employee Department: " + employee.getEmployeeDepartment());
            System.out.println("Employee Manager: " + employee.getEmployeeManager());
        } catch (InvalidDataFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
