package io.growtogether.training_employee.domain.service.repository.impl;

import io.growtogether.training_employee.domain.dto.Employee;
import io.growtogether.training_employee.domain.dto.PaginatedResponse;
import io.growtogether.training_employee.domain.port.EmployeeRepositoryPort;
import io.growtogether.training_employee.domain.service.repository.EmployeeService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DomainEmployeeService implements EmployeeService {

    private final EmployeeRepositoryPort employeeRepositoryPort;

    @Override
    public PaginatedResponse<Employee> getEmployees(int page, int size) {
        return employeeRepositoryPort.getEmployees(page, size);
    }

    @Override
    public Employee findEmployeeById(Long employeeId) {
        return employeeRepositoryPort.findEmployeeById(employeeId);
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepositoryPort.createEmployee(employee);
    }
}
