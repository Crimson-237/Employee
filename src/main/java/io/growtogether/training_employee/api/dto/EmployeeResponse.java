package io.growtogether.training_employee.api.dto;

import io.growtogether.training_employee.domain.dto.Department;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record EmployeeResponse(Long employeeId,
                               String firstName,
                               String lastName,
                               String email,
                               Department department,
                               LocalDateTime localDateTime) {
}
