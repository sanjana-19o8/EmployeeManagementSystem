package com.employeemanagement.model;

public class Employee {
    private static int idCounter = 1;

    private int employeeId;
    private String employeeName;
    private String employeeDepartment;
    private String employeeManager;

    public Employee(String employeeName, String employeeDepartment, String employeeManager) {
        this.employeeId = idCounter++;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.employeeManager = employeeManager;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public String getEmployeeManager() {
        return employeeManager;
    }
}
