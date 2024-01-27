
# Employee Management System

## Overview

The Employee Management System is a Java application designed to manage employee data by synchronizing information from diverse sources, such as files and console input. It provides a unified way to store and retrieve employee details with support for different types of employees, including Full-Time Employees (FTE), Interns, and Contractors.

## Features

- Read employee data from both file and console sources.
- Store and manage different types of employees.
- Log employee data with the source it came from into a log file.
- Handle custom exceptions for bad data states.

## Models

### Employee

- **Attributes:**
  - Employee Id (Automatically generated when an employee is created)
  - Employee Name
  - Employee Department
  - Employee Manager

### Employee Types

- Full-Time Employee (FTE)
- Intern
- Contractor

### FileDatasource

- Data sourced from a file.
- Structure: (Employee Id)-(Employee Name)-(Employee Department)-(Employee Manager)

### ConsoleDatasource

- Data sourced from the console terminal.
- Format: Each attribute separated by a new line.

## Usage

### Running the Application

1. Compile the application using the provided compilation command.

   ```bash
   javac -cp . src/main/java/com/employeemanagement/model/*.java src/main/java/com/employeemanagement/datasource/*.java src/main/java/com/employeemanagement/exception/*.java src/main/java/com/employeemanagement/*.java src/test/java/com/employeemanagement/model/*.java src/test/java/com/employeemanagement/datasource/*.java src/test/java/com/employeemanagement/*.java
   ```

2. Run the application using the provided execution command.

   ```bash
   java -cp . com.employeemanagement.EmployeeManagementSystem
   ```

### Testing

- The application includes a test suite for various components, including employee models and data sources. Run the tests to ensure the application functions as expected.
