package com.example.springbootassessment.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}