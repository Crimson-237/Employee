package io.growtogether.training_employee.domain.exception;

import io.growtogether.training_employee.domain.dto.Employee;

public class InvalidPhoneNumberFormatException extends RuntimeException {

    public InvalidPhoneNumberFormatException(Employee employeeRequest) {
        super("Invalid phone number format " + employeeRequest.getPhoneNumber());
    }
}
