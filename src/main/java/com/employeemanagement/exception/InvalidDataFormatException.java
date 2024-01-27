package com.employeemanagement.exception;

public class InvalidDataFormatException extends RuntimeException {
    public InvalidDataFormatException(String message) {
        super(message);
    }
}
