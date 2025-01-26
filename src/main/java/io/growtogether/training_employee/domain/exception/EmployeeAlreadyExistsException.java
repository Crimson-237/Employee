package io.growtogether.training_employee.domain.exception;

import io.growtogether.training_employee.domain.dto.Employee;

public class EmployeeAlreadyExistsException extends RuntimeException {
    public EmployeeAlreadyExistsException(Employee employee) {
        super("Employee with email " + employee.getEmail() + " already exists.");
    }
}
