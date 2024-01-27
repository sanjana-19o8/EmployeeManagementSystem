package com.employeemanagement.model;

public class FTETest {
    public static void main(String[] args) {
        // Create an FTE object and test its inheritance from Employee
        FTE fte = new FTE("Alice Smith", "HR", "Director");
        System.out.println("FTE ID: " + fte.getEmployeeId());
        System.out.println("FTE Name: " + fte.getEmployeeName());
        System.out.println("FTE Department: " + fte.getEmployeeDepartment());
        System.out.println("FTE Manager: " + fte.getEmployeeManager());
    }
}
