package io.growtogether.training_employee.infra.repository.mysqlAdapter.mapper;

import io.growtogether.training_employee.domain.dto.Employee;
import io.growtogether.training_employee.infra.repository.mysqlAdapter.entity.EmployeeEntity;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {

    Employee mapToEmployeeResponse(EmployeeEntity employeeEntity);

    EmployeeEntity mapToEmployee(Employee employee);
}
