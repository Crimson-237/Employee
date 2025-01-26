package io.growtogether.training_employee.domain.service.decoratorPatten;

import io.growtogether.training_employee.domain.dto.Employee;
import io.growtogether.training_employee.domain.service.repository.EmployeeService;

public class EmployeeServiceValidationDecorator extends EmployeeServiceDecorator {

    private final EmployeeRequestValidation employeeRequestValidation;

    public EmployeeServiceValidationDecorator(EmployeeService decoratedEmployeeService,
                                              EmployeeRequestValidation employeeRequestValidation) {
        super(decoratedEmployeeService);
        this.employeeRequestValidation = employeeRequestValidation;
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRequestValidation.validate(employee);
        super.createEmployee(employee);
    }
}
