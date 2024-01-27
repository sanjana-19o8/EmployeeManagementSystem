package com.employeemanagement.datasource;

import com.employeemanagement.model.Employee;
import com.employeemanagement.exception.InvalidDataFormatException;

public class FileDatasource implements Datasource {
    @Override
    public Employee readEmployee(String line) throws InvalidDataFormatException {
        String[] attributes = line.split("-");
        if (attributes.length != 4) {
            throw new InvalidDataFormatException("Invalid data format in file: " + line);
        }

        return new Employee(attributes[1], attributes[2], attributes[3]);
    }
}
