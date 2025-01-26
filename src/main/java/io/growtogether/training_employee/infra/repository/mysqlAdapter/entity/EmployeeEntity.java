package io.growtogether.training_employee.infra.repository.mysqlAdapter.entity;

import io.growtogether.training_employee.domain.dto.Bank;
import io.growtogether.training_employee.domain.dto.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Department department;
    private LocalDateTime localDateTime;
    private Bank bank;

    @PrePersist
    private void onCreate() {
        this.localDateTime = LocalDateTime.now();
    }
}
