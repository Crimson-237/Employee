package io.growtogether.training_employee.domain.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long employeeId) {
        super("Employee not Found " + employeeId);
    }
}
