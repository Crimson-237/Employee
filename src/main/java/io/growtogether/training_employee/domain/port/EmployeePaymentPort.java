package io.growtogether.training_employee.domain.port;

import io.growtogether.training_employee.domain.dto.Bank;
import io.growtogether.training_employee.domain.dto.Employee;

public interface EmployeePaymentPort {

    void makePayment(Employee employee);

    Bank BankPayment();
}
