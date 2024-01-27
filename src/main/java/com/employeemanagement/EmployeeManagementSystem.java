package com.employeemanagement;

import com.employeemanagement.datasource.ConsoleDatasource;
import com.employeemanagement.datasource.Datasource;
import com.employeemanagement.datasource.FileDatasource;
import com.employeemanagement.exception.InvalidDataFormatException;
import com.employeemanagement.model.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private static final String LOG_FILE_PATH = "src/main/java/com/employeemanagement/resources/employee_log.txt";
    private static final List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        // Read data from file and console simultaneously
        readData(new FileDatasource(), "12345-Vishal Gupta-Fo Tech-Fiaz Mohamed");
        readData(new ConsoleDatasource(), "John Doe\nHR\nManager");

        // Print employee details
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeId() + ": " + employee.getEmployeeName() +
                    " - " + employee.getEmployeeDepartment() + " - " + employee.getEmployeeManager());
        }
    }

    // Add a getter method for the employees list
    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public static void readData(Datasource datasource, String inputData) {
        try {
            Employee employee = datasource.readEmployee(inputData);
            employees.add(employee);
            logEmployeeData(employee, datasource.getClass().getSimpleName());
        } catch (InvalidDataFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void logEmployeeData(Employee employee, String dataSource) {
        String logEntry = String.format("%d-%s-%s-%s-%s", employee.getEmployeeId(), employee.getEmployeeName(),
                employee.getEmployeeDepartment(), employee.getEmployeeManager(), dataSource);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, true))) {
            writer.write(logEntry);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}
