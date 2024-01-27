package com.employeemanagement.model;

public class ContractorTest {
    public static void main(String[] args) {
        // Create a Contractor object and test its inheritance from Employee
        Contractor contractor = new Contractor("Eve Davis", "Finance", "Manager");
        System.out.println("Contractor ID: " + contractor.getEmployeeId());
        System.out.println("Contractor Name: " + contractor.getEmployeeName());
        System.out.println("Contractor Department: " + contractor.getEmployeeDepartment());
        System.out.println("Contractor Manager: " + contractor.getEmployeeManager());
    }
}
