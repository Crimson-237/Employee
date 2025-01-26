package io.growtogether.training_employee.domain.service.payment.impl;

import io.growtogether.training_employee.domain.dto.Bank;
import io.growtogether.training_employee.domain.port.EmployeePaymentPort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
public class PaymentFactory {
    private final Map<String, EmployeePaymentPort> employeePaymentPortMap;
    private final List<EmployeePaymentPort> employeePaymentPorts;

    public EmployeePaymentPort getPaymentService(Bank bank) {
        return Optional.ofNullable(employeePaymentPortMap.get(bank.name()))
                .orElseThrow(() -> new IllegalArgumentException("Unsupported bank"));
    }

    public EmployeePaymentPort findPaymentService(Bank bank) {
        return employeePaymentPorts.stream()
                .filter(port -> bank == port.BankPayment())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unsupported bank"));
    }
}
