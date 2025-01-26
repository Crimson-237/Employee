package io.growtogether.training_employee.domain.port;

import io.growtogether.training_employee.domain.dto.Employee;
import io.growtogether.training_employee.domain.dto.PaginatedResponse;

public interface EmployeeRepositoryPort {

    PaginatedResponse<Employee> getEmployees(int page, int size);

    void createEmployee(Employee employee);

    Employee findEmployeeById(Long employeeId);

    boolean isUserPresent(String email);

    void deleteEmployeeById(Long employeeId);
}
