package io.growtogether.training_employee.domain.exception;

import io.growtogether.training_employee.domain.dto.Employee;

public class InvalidEmailFormatException extends RuntimeException {

    public InvalidEmailFormatException(Employee employeeRequest) {
        super("Invalid email format: " + employeeRequest.getEmail());
    }
}
