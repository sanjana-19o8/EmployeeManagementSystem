package com.employeemanagement.datasource;

import com.employeemanagement.model.Employee;
import com.employeemanagement.exception.InvalidDataFormatException;

import java.util.Scanner;

public class ConsoleDatasource implements Datasource {
    @Override
    public Employee readEmployee(String input) throws InvalidDataFormatException {
        String[] attributes = input.split("\\n");
        if (attributes.length != 3) {
            throw new InvalidDataFormatException("Invalid data format from console input: " + input);
        }

        return new Employee(attributes[0], attributes[1], attributes[2]);
    }
}
