package com.employeemanagement.datasource;

import com.employeemanagement.model.Employee;
import com.employeemanagement.exception.InvalidDataFormatException;

public interface Datasource {
    Employee readEmployee(String input) throws InvalidDataFormatException;
}
