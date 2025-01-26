package io.growtogether.training_employee.api.mapper;

import io.growtogether.training_employee.api.dto.EmployeeRequest;
import io.growtogether.training_employee.api.dto.EmployeeResponse;
import io.growtogether.training_employee.domain.dto.Employee;
import io.growtogether.training_employee.domain.dto.PaginatedResponse;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeResponseMapper {
    PaginatedResponse<EmployeeResponse> mapToPaginatedResponse(PaginatedResponse<Employee> paginatedResponse);

    EmployeeResponse mapToEmployeeResponse(Employee employee);

    Employee mapToEmployee(EmployeeRequest employeeRequest);
}
