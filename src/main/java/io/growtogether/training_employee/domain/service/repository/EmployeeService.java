package io.growtogether.training_employee.domain.service.repository;

import io.growtogether.training_employee.domain.dto.Employee;
import io.growtogether.training_employee.domain.dto.PaginatedResponse;

public interface EmployeeService {
    PaginatedResponse<Employee> getEmployees(int page, int size);

    Employee findEmployeeById(Long employeeId);

    void createEmployee(Employee employee);
}
