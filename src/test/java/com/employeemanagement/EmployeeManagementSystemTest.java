package com.employeemanagement;

import com.employeemanagement.datasource.ConsoleDatasource;
import com.employeemanagement.datasource.FileDatasource;
import com.employeemanagement.datasource.Datasource;
import com.employeemanagement.model.Employee;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class EmployeeManagementSystemTest {
    public static void main(String[] args) {
        // Test the EmployeeManagementSystem
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        // Test reading data from file and console
        testReadData(system);

        // Print employee details
        List<Employee> employees = system.getEmployees();
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeId() + ": " + employee.getEmployeeName() +
                    " - " + employee.getEmployeeDepartment() + " - " + employee.getEmployeeManager());
        }

        // Test log file content
        testLogFileContent();
    }

    private static void testReadData(EmployeeManagementSystem system) {
        Datasource fileDatasource = new FileDatasource();
        Datasource consoleDatasource = new ConsoleDatasource();

        // Test reading data from file
        system.readData(fileDatasource, "12345-Vishal Gupta-Fo Tech-Fiaz Mohamed");

        // Test reading data from console
        system.readData(consoleDatasource, "John Doe\nHR\nManager");
    }

    private static void testLogFileContent() {
        try {
            // Read log file content
            File logFile = new File("src/main/java/com/employeemanagement/resources/employee_log.txt");
            List<String> lines = Files.readAllLines(logFile.toPath());

            // Print log file content
            System.out.println("Log File Content:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading log file: " + e.getMessage());
        }
    }
}
