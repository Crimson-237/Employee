package io.growtogether.training_employee.api.dto;

import io.growtogether.training_employee.domain.dto.Bank;
import io.growtogether.training_employee.domain.dto.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class EmployeeRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Department department;
    private Bank bank;
}